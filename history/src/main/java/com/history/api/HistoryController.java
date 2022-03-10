package com.history.api;

import com.history.entity.HistoryDto;
import com.history.service.HistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/history")
@RequiredArgsConstructor
public class HistoryController {
    private final HistoryService historyService;

    @GetMapping
    public ResponseEntity<List<HistoryDto>> findAll() {
        return ResponseEntity.ok(historyService.findAll());
    }

    @GetMapping("/{historyId}")
    public ResponseEntity<HistoryDto> findById(@PathVariable String historyId) {
        return ResponseEntity.ok(historyService.findById(historyId));
    }

    @PostMapping
    public ResponseEntity<HistoryDto> save(@RequestBody HistoryDto categoryDto) {
        return ResponseEntity.ok(historyService.save(categoryDto));
    }

    @PutMapping
    public ResponseEntity<HistoryDto> update(@RequestBody HistoryDto categoryDto) {
        return ResponseEntity.ok(historyService.update(categoryDto));
    }

    @DeleteMapping("/{historyId}")
    public void deleteById(@PathVariable String historyId) {
        historyService.delete(historyId);
    }
}
