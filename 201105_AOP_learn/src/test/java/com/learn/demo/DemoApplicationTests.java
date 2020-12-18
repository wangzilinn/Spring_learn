package com.learn.demo;

import com.learn.demo.dao.DAO;
import com.learn.demo.dao.IndexDAO;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;


// @RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	@Test
	public void perTest(){
		AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(DemoApplication.class);
		DAO indexDao = configApplicationContext.getBean(DAO.class);
		indexDao.query();


	}
}

