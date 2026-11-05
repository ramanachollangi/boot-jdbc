package com.sprdlearn.boot.bootjdbc.service;

import com.sprdlearn.boot.bootjdbc.beans.StoreBo;
import com.sprdlearn.boot.bootjdbc.dao.StoreDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StoreService {

    @Autowired
    private StoreDao storeDao;

    public int createStore(StoreBo storeBo){
       return storeDao.newStore(storeBo);
    }
}

