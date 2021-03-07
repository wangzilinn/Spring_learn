package com.wangzilin.site.POJO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @Author: wangzilinn@gmail.com
 * @Date: 3/7/2021 6:43 PM
 */
@Data
@Document
@NoArgsConstructor
@CompoundIndexes({
        @CompoundIndex(name = "name_age", def = "{'name' : 1, 'age': 1}")
})
public class User {

    private String name;

    private Integer age;

    @PersistenceConstructor
    public User(String name,@Value("#root.age ?: 10") int age) {
        this.name = name;
        this.age = age;
    }

}
