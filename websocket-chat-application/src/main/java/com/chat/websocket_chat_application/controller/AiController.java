package com.chat.websocket_chat_application.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ai")
public class AiController {

    @PostMapping("/respond")
    public String aiRespond(@RequestBody String message) {
        // Replace this with a real AI API call
        return "AI says: " + message;
    }
}