package com.averyday.demo.springbootConf;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Description
 * Author ayt  on
 */
@EnableConfigurationProperties(DataSouse.class)
@Configuration
public class DataSourceConfig {
    @Autowired
    DataSouse dataSouse;

    @Bean
    public DataSource myDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(dataSouse.getAddress());
        dataSource.setUsername(dataSouse.getName());
        dataSouse.setPassword(dataSouse.getPassword());
        return dataSource;
    }
}
