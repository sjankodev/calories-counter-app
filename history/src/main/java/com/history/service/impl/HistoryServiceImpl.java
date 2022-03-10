package com.history.service.impl;

import com.history.entity.HistoryDto;
import com.history.repository.HistoryRepository;
import com.history.service.HistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class HistoryServiceImpl implements HistoryService {


    private final HistoryRepository historyRepository;

    @Override
    public List<HistoryDto> findAll() {
        return historyRepository.findAll();
    }

    @Override
    public HistoryDto findById(String historyId) {
        return historyRepository.findById(historyId).orElseThrow(() -> new NoSuchElementException("History ID not found"));
    }

    @Override
    public HistoryDto save(HistoryDto foodDto) {
        return historyRepository.save(foodDto);
    }

    @Override
    public HistoryDto update(HistoryDto foodDto) {
        return historyRepository.save(foodDto);
    }

    @Override
    public void delete(String historyId) {
        historyRepository.deleteById(historyId);
    }
}