package com.food.service;

import com.food.entity.FoodDto;

import java.util.List;

public interface FoodService {

    List<FoodDto> findAll();

    FoodDto findById(String foodId);

    FoodDto save(FoodDto foodDto);

    FoodDto update(FoodDto foodDto);

    void delete(String foodId);
}

    

