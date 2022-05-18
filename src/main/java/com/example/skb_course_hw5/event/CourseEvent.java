package com.example.skb_course_hw5.event;

import org.springframework.context.ApplicationEvent;

public class CourseEvent extends ApplicationEvent {

    private String message;

    public CourseEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
