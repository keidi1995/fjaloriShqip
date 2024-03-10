package com.fjalorishqip.fjalorishqip.controller;

import com.fjalorishqip.fjalorishqip.model.Word;
import com.fjalorishqip.fjalorishqip.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/words")
public class WordController {

    private final WordService wordService;

    @Autowired
    public WordController(WordService wordService) {
        this.wordService = wordService;
    }

    @PostMapping // Handle POST requests to /words endpoint
    public String addWord(@RequestBody Word word) {
        wordService.addWord(word); // Call addWord method in WordService
        return "Word added successfully";
    }

    @GetMapping // Handle GET requests to /words endpoint
    public List<Word> getAllWords() {
        return wordService.getAllWords(); // Call getAllWords method in WordService
    }
    @PutMapping("/{id}") // Handle PUT requests to /words/{id} endpoint for updating a word
    public String updateWord(@PathVariable Long id, @RequestBody Word word) {
        wordService.updateWord(id, word); // Call updateWord method in WordService
        return "Word updated successfully";
    }
    
    @DeleteMapping("/{id}") // Handle DELETE requests to /words/{id} endpoint for deleting a word
    public String deleteWord(@PathVariable Long id) {
        wordService.deleteWord(id); // Call deleteWord method in WordService
        return "Word deleted successfully";
    }
}
