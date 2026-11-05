package com.sprdlearn.boot.bootjdbc;

import com.sprdlearn.boot.bootjdbc.beans.StoreBo;
import com.sprdlearn.boot.bootjdbc.service.StoreService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootJdbcApplication {

    public static void main(String[] args) {
        ApplicationContext ctx= SpringApplication.run(BootJdbcApplication.class, args);
        StoreService serviceBo= ctx.getBean(StoreService.class);
        System.out.println(serviceBo.createStore(new StoreBo(0,"Hyd","India","Aratlakatta","9666963276","AP","Louki","533016")));
    }

}
