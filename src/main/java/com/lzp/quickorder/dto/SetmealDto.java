package com.lzp.quickorder.dto;

import com.lzp.quickorder.entity.Setmeal;
import com.lzp.quickorder.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
