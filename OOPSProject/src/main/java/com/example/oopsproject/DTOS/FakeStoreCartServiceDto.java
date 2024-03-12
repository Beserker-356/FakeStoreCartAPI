package com.example.oopsproject.DTOS;

import com.example.oopsproject.Models.Products;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Getter
@Setter
public class FakeStoreCartServiceDto {
    private double id;
    private double userId;
    private String date;
    private HashMap<String, Integer>[] products;
}
