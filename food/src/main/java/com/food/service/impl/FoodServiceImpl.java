package com.food.service.impl;

import com.food.entity.FoodDto;
import com.food.repository.FoodRepository;
import com.food.service.FoodService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;


@Service
@RequiredArgsConstructor
public class FoodServiceImpl implements FoodService {

    private final FoodRepository foodRepository;


    @Override
    public List<FoodDto> findAll() {
        return foodRepository.findAll();
    }

    @Override
    public FoodDto findById(String categoryId) {
        return foodRepository.findById(categoryId).orElseThrow(() -> new NoSuchElementException("Food ID not found"));
    }

    @Override
    public FoodDto save(FoodDto foodDto) {
        return foodRepository.save(foodDto);
    }

    @Override
    public FoodDto update(FoodDto foodDto) {
        return foodRepository.save(foodDto);
    }

    @Override
    public void delete(String categoryId) {
        foodRepository.deleteById(categoryId);
    }
}
