package com.wangzilin.site;

import com.wangzilin.site.POJO.Article;
import com.wangzilin.site.mongoRepsitory.ArticleRepository;
import com.wangzilin.site.POJO.Customer;
import com.wangzilin.site.mongoRepsitory.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SiteApplication {

	// @Autowired
	// private CustomerRepository customerRepository;
	// @Autowired
	// private ArticleRepository articleRepository;
	public static void main(String[] args) {
		SpringApplication.run(SiteApplication.class, args);
	}

	// @Override
	// public void run(String... args) throws Exception{
	// 	customerRepository.deleteAll();
	// 	//save a couple of customers
	// 	customerRepository.save(new Customer("Alice", "Smith"));
	// 	customerRepository.save(new Customer("bob", "Smith"));
	//
	// 	//fetch all customers
	// 	for (Customer customer : customerRepository.findAll()) {
	// 		System.out.println(customer);
	// 	}
	//
	// 	//find firstName Alice
	// 	System.out.println(customerRepository.findByFirstName("Alice"));
	// 	//find last name Smith
	// 	for (Customer customer : customerRepository.findByLastName("Smith")) {
	// 		System.out.println(customer);
	// 	}
	//
	// 	articleRepository.save(new Article("titleName", "textfield"));
	// 	articleRepository.save(new Article("titleName2", "textfield2"));

	// }


}
