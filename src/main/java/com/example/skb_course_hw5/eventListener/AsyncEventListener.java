package com.example.skb_course_hw5.eventListener;

import com.example.skb_course_hw5.event.CourseEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AsyncEventListener {

    @Async
    @EventListener
    public void HandleEvent(CourseEvent event) throws InterruptedException {
        System.out.println("Async listener: event handled");
        Thread.sleep(1000);
        System.out.println("Async listener: event contains message:" + event.getMessage());
    }
}
