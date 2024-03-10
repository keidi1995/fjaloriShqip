package com.fjalorishqip.fjalorishqip.model;

public class Word {
    private String word;
    private String description;
    private Long id;
    // Constructors, getters, setters


    public Word() {
    }

    public Word(String word) {
        this.word = word;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}
