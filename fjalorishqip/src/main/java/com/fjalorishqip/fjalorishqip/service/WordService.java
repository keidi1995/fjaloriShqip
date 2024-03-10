package com.fjalorishqip.fjalorishqip.service;

import com.fjalorishqip.fjalorishqip.model.Word;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class WordService {
    private List<Word> words = new ArrayList<>();
    private final AtomicLong idGenerator = new AtomicLong(1);

    public void addWord(Word word) {
        word.setId(idGenerator.getAndIncrement());
        words.add(word);
    }

    public List<Word> getAllWords() {
        return words;
    }
    public void updateWord(Long id, Word updatedWord) {
        for (Word word : words) {
            if (word.getId().equals(id)) {
                word.setWord(updatedWord.getWord());
                word.setDescription(updatedWord.getDescription());
                break;
            }
        }
    }
    public void deleteWord(Long id) {
        Iterator<Word> iterator = words.iterator();
        while (iterator.hasNext()) {
            Word word = iterator.next();
            if (word.getId().equals(id)) {
                iterator.remove();
                break;
            }
        }
    }
}
