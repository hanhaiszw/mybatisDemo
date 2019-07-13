package com.example.demo.repository;

import com.example.demo.model.Student;

import java.util.List;

/**
 * create by sunzhongwei on 2019/07/13
 * Desc:
 **/
public interface StudentMapper {
    Student getStudentById(Long id);

    List<Student> getAllStudentInfo();
}
