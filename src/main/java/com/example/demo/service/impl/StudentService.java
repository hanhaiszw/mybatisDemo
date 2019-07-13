package com.example.demo.service.impl;

import com.example.demo.model.Student;

import java.util.List;

/**
 * create by sunzhongwei on 2019/07/13
 * Desc:
 **/
public interface StudentService {
    Student getStudentById(Long id);
    List<Student> getAllStudentInfo();
}
