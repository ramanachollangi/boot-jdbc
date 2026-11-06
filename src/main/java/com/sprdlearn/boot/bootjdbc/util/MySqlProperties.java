package com.sprdlearn.boot.bootjdbc.util;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "custom.mysql")
public class MySqlProperties {
    private String url;
    private String userName;
    private String password;
    private String driverClassName ="com.mysql.cj.jdbc.Driver";

}
