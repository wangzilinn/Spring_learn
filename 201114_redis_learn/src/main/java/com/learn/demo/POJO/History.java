package com.learn.demo.POJO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class History implements Serializable {
    private String id;
    private int value;

    public static History randomInit() {
        int random = (int) (Math.random() * 100);
        long time = new Date().getTime();
        String id = time + String.valueOf(random);
        return new History(id, random);
    }
}
