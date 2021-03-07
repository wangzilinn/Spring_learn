package com.wangzilin.site.mongoTemplate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: wangzilinn@gmail.com
 * @Date: 3/7/2021 6:45 PM
 */
@SpringBootTest
class ArticleDAOTest {
    @Autowired
    private ArticleDAO articleDAO;

    @Test
    void add() {
        articleDAO.add();
    }

    @Test
    void find() {
        articleDAO.find();
    }
}
