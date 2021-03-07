package com.wangzilin.site.mongoRepsitory;

import com.wangzilin.site.POJO.Article;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArticleRepository extends MongoRepository<Article, String> {
    Article findByTitle(String title);
}
