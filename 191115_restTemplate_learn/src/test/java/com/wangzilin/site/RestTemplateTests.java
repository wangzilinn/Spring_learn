package com.wangzilin.site;

import com.wangzilin.site.bean.Product;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class RestTemplateTests {
    private RestTemplate restTemplate = null;

    @Before
    public void setup(){
        restTemplate = new RestTemplate();
    }

    @Test
    public void test_Get_product1(){
        String url =  "http://localhost:8000/product/get_product1";
        String result = restTemplate.getForObject(url, String.class);
        System.out.println("get_product1 = " + result);
        Assert.hasText(result, "not return text");

        Product product = restTemplate.getForObject(url, Product.class);
        System.out.println("get_product1 = " + product);
        Assert.notNull(product, "return is null");

        ResponseEntity<Product> responseEntity = restTemplate.getForEntity(url, Product.class);
        System.out.println("get product = " + responseEntity);
        Assert.isTrue(responseEntity.getStatusCode().equals(HttpStatus.OK), "response is not 200");
    }

    @Test
    public void testGet_product2(){
        String url =  "http://localhost:8000/product/get_product2/?id={id}";

        ResponseEntity<Product> responseEntity = restTemplate.getForEntity(url, Product.class, 101);
        System.out.println(responseEntity);
        Assert.isTrue(responseEntity.getStatusCode().equals(HttpStatus.OK), "get request failed");

        Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("id", 101);
        Product productResult = restTemplate.getForObject(url, Product.class, uriVariables);
        System.out.println(productResult);

    }

    @Test
    public void testPost_produce1(){
//        String
    }
}
