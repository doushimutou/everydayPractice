package com.averyday.demo.controller;

import com.averyday.demo.base.readProperties.StudentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description
 * Author ayt  on
 */
@RestController
@RequestMapping(("base"))
@PropertySource("classpath:test.properties")
public class Base {

    @Value("${userName.test}")
    String userName;
    @Autowired
    StudentDto studentDto;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String base() {

        System.out.println(studentDto.getAddress());
        String userName1 = userName;
        return userName1;

    }
}
