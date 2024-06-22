package com.example.harry2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("test11")
    public String test11() {
        return "test11";
    }
}
