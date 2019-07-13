package com.example.demo.controller;

import com.example.demo.model.Stu;
import com.example.demo.model.Student;
import com.example.demo.service.impl.StudentService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * create by sunzhongwei on 2019/07/13
 * Desc:
 **/
@RestController
@EnableAutoConfiguration
@RequestMapping("/student")
public class StudentController {

    @Resource
    StudentService studentService;

    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = "application/json")
    public Student getStudent(@PathVariable long id) {
        Student student = this.studentService.getStudentById(id);
        return student;
    }


    @RequestMapping(value = "/all", method = RequestMethod.GET, produces = "application/json")
    public Map<Integer,List<Stu>> getAllStudentInfo() {
        List<Student> studentList = this.studentService.getAllStudentInfo();
        //return studentList;
        Map<Integer,List<Stu>> retMap = new HashMap<>();
        for (Student student : studentList) {
            Integer key = student.getGrade();
            if(!retMap.containsKey(key)){
                retMap.put(key,new ArrayList<>());
            }
            retMap.get(key).add(new Stu(student.getId(),student.getName()));
        }
        return retMap;
    }

}
