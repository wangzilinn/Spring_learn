package com.wangzilin.site.controller;

import com.wangzilin.site.bean.Product;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;

import java.math.BigDecimal;

@RequestMapping("/product")
@RestController
public class ProduceController {

    @GetMapping("/get_product1")
    public Product get_product1() {
        return new Product(1, "product1", BigDecimal.valueOf(100));
    }

    @GetMapping("/get_product2")
    public Product get_product2(Integer id) {
        return new Product(id, "product2", BigDecimal.valueOf(200));
    }

    @GetMapping("/get_product3")
    public Product get_product3() {
        return new Product(3, "product3", BigDecimal.valueOf(300));
    }

    @PostMapping("/post_product1")
    public String post_product1(Product product) {
        return product.toString();
    }

    @PostMapping("/post_product2")
    public String post_product2(@RequestBody Product product) {
        return product.toString();
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        String result = String.format("%s has been deleted", id);
        System.out.println(result);
        return result;
    }

    @PutMapping("/update")
    public String update_by_put(Product product) {
        String result = product.toString() + " updated";
        System.out.println(result);
        return result;
    }

    @PostMapping("/upload")
    public String upload(MultipartRequest multipartRequest) {
        MultipartFile multipartFile = multipartRequest.getFile("file");
        String originalFileName = multipartFile.getOriginalFilename();
        return "upload filename = " + originalFileName;
    }
}
