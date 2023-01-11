package com.coodesh.dictionary.service;

import java.util.concurrent.atomic.AtomicLong;

import com.coodesh.dictionary.model.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DictionaryService {

    private static final String defaultTemplate = "Fullstack Challenge \uD83C\uDFC5 - Dictionary";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/")
    public Message defaultMessage() {
        return new Message(defaultTemplate);
    }
}