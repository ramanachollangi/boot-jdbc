package com.sprdlearn.boot.bootjdbc.dao;

import com.sprdlearn.boot.bootjdbc.beans.Store;
import com.sprdlearn.boot.bootjdbc.beans.StoreBo;
import jakarta.persistence.EntityManagerFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class StoreDao {

    private static final String GET_STORE="SELECT city, country, location, phone, state, store_name AS storeName, zip FROM store";
    private static final String STORE_INSERT="insert into store (city,country,location,phone,state,store_name,zip) VALUES (:city, :country, :location, :phone, :state, :storeName, :zip)";
    private final JdbcClient jdbcClient;

    public int newStore(StoreBo storeBo) {
        return jdbcClient.sql(STORE_INSERT).paramSource(new BeanPropertySqlParameterSource(storeBo)).update();
    }

    public List<Store> getAllStores() {
        return jdbcClient.sql(GET_STORE).query((rs, rowNum) -> {
                    Store store = new Store();
                    store.setCity(rs.getString("city"));
                    store.setCountry(rs.getString("country"));
                    store.setLocation(rs.getString("location"));
                    store.setPhone(rs.getString("phone"));
                    store.setState(rs.getString("state"));
                    store.setStoreName(rs.getString("storeName"));
                    store.setZip(rs.getString("zip"));
                    return store;
                })
                .list();
    }
}
