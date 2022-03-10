package com.food.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(value = "food")
public class FoodDto {

    @Id
    private String foodId;
    private String name;
    private String description;
    private String image;
    private double calories;


}
