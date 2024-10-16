package com.example.test.multi_threading;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Autowired
    private AsyncService asyncService;

    @GetMapping("/start-task")
    public String startTask() {
        asyncService.performAsyncTask();
        return "Task started";
    }
}
