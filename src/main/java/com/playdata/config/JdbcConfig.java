package com.playdata.config;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;

public class JdbcConfig {
    private final String url = "jdbc:mysql://localhost:3306/todos" +
            "?serverTimezone=Asia/Seoul&characterEncoding=UTF-8";
    private final String username = "root";
    private final String password = "1q2w3e4r!!";

    public DataSource dataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;

    }
}
