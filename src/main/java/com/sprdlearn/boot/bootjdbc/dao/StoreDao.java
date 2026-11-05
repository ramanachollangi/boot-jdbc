package com.sprdlearn.boot.bootjdbc.dao;

import com.sprdlearn.boot.bootjdbc.beans.StoreBo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class StoreDao {

    private static final String STORE_INSERT="insert into store (city,country,location,phone,state,store_name,zip) VALUES (:city, :country, :location, :phone, :state, :storeName, :zip)";

    private final EntityManagerFactory entityManager;


    public int newStore(StoreBo storeBo) {

       EntityManager em=  entityManager.createEntityManager();
       em.persist(storeBo);
        return 0;
        // return jdbcClient.sql(STORE_INSERT).paramSource(new BeanPropertySqlParameterSource(storeBo)).update();
    }
}
