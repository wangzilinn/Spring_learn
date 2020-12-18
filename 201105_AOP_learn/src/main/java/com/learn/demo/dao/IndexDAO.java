package com.learn.demo.dao;

import org.springframework.stereotype.Component;

@Component
public class IndexDAO implements DAO {

    @Override
    public void query() {
        System.out.println("Querying,,,");
    }

    @Override
    public String toString() {
        return "testfhjkdsa";
    }
}
