package com.example.demo.model;

import lombok.Data;

/**
 * create by sunzhongwei on 2019/07/13
 * Desc:
 **/
@Data
public class Stu {
    Long id;
    String name;

    public Stu(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Stu() {
    }
}
