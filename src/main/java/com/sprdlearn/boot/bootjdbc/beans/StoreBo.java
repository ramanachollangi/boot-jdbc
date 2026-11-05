package com.sprdlearn.boot.bootjdbc.beans;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StoreBo {

    private int storeId;
    private String city;
    private String country;
    private String location;
    private String phone;
    private String state;
    private String storeName;
    private String zip;

}
