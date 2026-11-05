package com.sprdlearn.boot.bootjdbc.dao;

import com.sprdlearn.boot.bootjdbc.beans.StoreBo;
import jakarta.persistence.EntityManagerFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class StoreDao {

    private static final String STORE_INSERT="insert into store (city,country,location,phone,state,store_name,zip) VALUES (:city, :country, :location, :phone, :state, :storeName, :zip)";
    private final EntityManagerFactory entityManager;
    private final JdbcClient jdbcClient;

    public int newStore(StoreBo storeBo) {
        return jdbcClient.sql(STORE_INSERT).paramSource(new BeanPropertySqlParameterSource(storeBo)).update();
    }
}
