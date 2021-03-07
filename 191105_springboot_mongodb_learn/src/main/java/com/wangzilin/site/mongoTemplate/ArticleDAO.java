package com.wangzilin.site.mongoTemplate;
import com.wangzilin.site.POJO.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: wangzilinn@gmail.com
 * @Date: 3/7/2021 5:32 PM
 */
@Repository
@RequiredArgsConstructor
public class ArticleDAO {
    final private MongoTemplate mongoTemplate;

    void add() {
        User user = new User();
        user.setName("name");
        mongoTemplate.save(user);
    }

    void find() {
        User one = mongoTemplate.findOne(new Query(Criteria.where("name").is("Alice")), User.class, "user");
        System.out.println("one = " + one);
    }

}
