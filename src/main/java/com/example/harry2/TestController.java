package com.example.harry2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("test11")
    public String test11() {
        return "test11";
    }

    @GetMapping("test12")
    public String test12() {
        return "test12";
    }

    @GetMapping("test13")
    public String test13() {
        return "haekyu";
    }

    @GetMapping("test14")
    public String test14() {
        return "english?";
    }

    @GetMapping("test15")
    public String test15() {
        return "한국어?";
    }
}
