package com.sprdlearn.boot.bootjdbc.service;

import com.sprdlearn.boot.bootjdbc.beans.Store;
import com.sprdlearn.boot.bootjdbc.beans.StoreBo;
import com.sprdlearn.boot.bootjdbc.dao.StoreDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class StoreService {


    private final StoreDao storeDao;

    public int createStore(StoreBo storeBo){
       return storeDao.newStore(storeBo);
    }

    public List<Store> getAllStores() {
        return storeDao.getAllStores();
    }

}

