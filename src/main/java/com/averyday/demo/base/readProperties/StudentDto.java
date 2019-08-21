package com.averyday.demo.base.readProperties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Description
 * Author ayt  on
 */
@Component
@PropertySource("classpath:test.properties")
@ConfigurationProperties("student")
@Data
public class StudentDto {
    private String name;
    private String address;
}
