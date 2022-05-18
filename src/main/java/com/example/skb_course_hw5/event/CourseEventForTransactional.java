package com.example.skb_course_hw5.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.sql.SQLException;

public class CourseEventForTransactional extends ApplicationEvent {

    private String message;

    public CourseEventForTransactional(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {

        if (message.contains("error")) {
            throw new RuntimeException();
        }
        return message;
    }
}
