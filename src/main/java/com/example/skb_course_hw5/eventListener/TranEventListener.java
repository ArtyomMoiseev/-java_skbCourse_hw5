package com.example.skb_course_hw5.eventListener;

import com.example.skb_course_hw5.event.CourseEventForTransactional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.event.TransactionalEventListener;

@Service
public class TranEventListener {

    @TransactionalEventListener()
    public void HandleEvent(CourseEventForTransactional event) throws Exception {
        System.out.println("Transactional listener: event handled");
        System.out.println("Transactional listener: event contains message:" + event.getMessage());
        }
    }
