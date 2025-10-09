package com.lzp.quickorder.dto;

import com.lzp.quickorder.entity.Dish;
import com.lzp.quickorder.entity.DishFlavor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class DishDto extends Dish {

    private List<DishFlavor> flavors = new ArrayList<>();

    private String categoryName;

    private Integer copies;
}
