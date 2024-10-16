package com.example.test.multi_threading;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {
    @Async
    public void performAsyncTask() {
        System.out.println("Executing task in thread: " + Thread.currentThread().getName());
        // Simulate a long-running task
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Task completed");
    }
}
