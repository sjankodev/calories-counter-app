package com.history.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("history")
public class HistoryDto {

    @Id
    private String historyId;
    private String userId;
    private String foodId;
    private double totalCalories;


}
