package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentMapper;
import com.example.demo.service.impl.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * create by sunzhongwei on 2019/07/13
 * Desc:
 **/
@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;

    @Override
    public Student getStudentById(Long id) {
        return studentMapper.getStudentById(id);
    }

    @Override
    public List<Student> getAllStudentInfo() {
        return studentMapper.getAllStudentInfo();
    }
}
