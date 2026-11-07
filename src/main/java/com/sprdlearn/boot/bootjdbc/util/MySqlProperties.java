package com.sprdlearn.boot.bootjdbc.util;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "datasource.mysql")
public class MySqlProperties {
    private String url;
    private String userName;
    private String password;
    private String driverClassName;

}
