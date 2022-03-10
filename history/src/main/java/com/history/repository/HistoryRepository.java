package com.history.repository;

import com.history.entity.HistoryDto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoryRepository extends MongoRepository<HistoryDto, String> {
}
