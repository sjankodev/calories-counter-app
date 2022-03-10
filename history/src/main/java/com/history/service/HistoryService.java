package com.history.service;

import com.history.entity.HistoryDto;

import java.util.List;

public interface HistoryService {

    List<HistoryDto> findAll();

    HistoryDto findById(String historyId);

    HistoryDto save(HistoryDto foodDto);

    HistoryDto update(HistoryDto foodDto);

    void delete(String historyId);
}
    

