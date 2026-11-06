package com.sprdlearn.boot.bootjdbc.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Store {
    private Long id;
    private String city;
    private String country;
    private String location;
    private String phone;
    private String state;
    private String storeName;
    private String zip;
}
