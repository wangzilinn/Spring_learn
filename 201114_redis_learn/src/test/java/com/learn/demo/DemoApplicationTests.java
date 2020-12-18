package com.learn.demo;

import com.learn.demo.POJO.History;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.LinkedHashMap;


// @RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	RedisTemplate<String, Object> redisTemplate;

	@Test
	public void test(){
		ArrayList<History> histories = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			histories.add(History.randomInit());
		}
		System.out.println(histories);
		for (int i = 0; i < 100; i++) {
			History history = histories.get(i);
			redisTemplate.opsForList().leftPush("1", history);
		}
		ArrayList<History> result = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			result.add((History) redisTemplate.opsForList().rightPop("1"));
		}
		System.out.println(result);


	}
}

