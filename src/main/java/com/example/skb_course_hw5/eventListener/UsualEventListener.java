package com.example.skb_course_hw5.eventListener;

import com.example.skb_course_hw5.event.CourseEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class UsualEventListener {

    @EventListener
    void HandleEvent(CourseEvent event) {
        System.out.println("Usual listener: event handled");
        System.out.println("Usual listener: event contains message:" + event.getMessage());
    }
}
