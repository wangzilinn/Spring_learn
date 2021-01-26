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
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;


// @RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	RedisTemplate<String, Object> redisTemplate;

	@Test
	public void test(){
		// HashMap<String, List<History>> map = new HashMap<>();
		//
		// ArrayList<History> histories1 = new ArrayList<>();
		// for (int i = 0; i < 100; i++) {
		// 	histories1.add(History.randomInit());
		// }
		//
		// map.put("1", histories1);
		//
		// ArrayList<History> histories2 = new ArrayList<>();
		// for (int i = 0; i < 100; i++) {
		// 	histories2.add(History.randomInit());
		// }
		//
		// map.put("2", histories2);
		//
		// ArrayList<History> histories3 = new ArrayList<>();
		// for (int i = 0; i < 100; i++) {
		// 	histories3.add(History.randomInit());
		// }
		//
		// map.put("3", histories3);
		//
		// redisTemplate.opsForHash().putAll("id", map);
		//
		// System.out.println(redisTemplate.opsForHash().entries("id"));
		// for (int i = 0; i < 100; i++) {
		// 	redisTemplate.opsForList().leftPush("1", i);
		// }

		System.out.println(redisTemplate.opsForList().index("1", 100));

		// redisTemplate.delete("id");


	}
}

