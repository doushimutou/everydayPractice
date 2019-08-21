package com.averyday.demo.springbootConf;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Description
 * Author ayt  on
 */
@ConfigurationProperties(prefix = "mybatis.datasource")
@Getter
@Setter
public class DataSouse {
    private String name;
    private String password;
    private String address;
}
