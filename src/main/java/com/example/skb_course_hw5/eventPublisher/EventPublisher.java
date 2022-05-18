package com.example.skb_course_hw5.eventPublisher;

import com.example.skb_course_hw5.event.CourseEvent;
import com.example.skb_course_hw5.event.CourseEventForTransactional;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class EventPublisher {

    final ApplicationEventPublisher publisher;

    public void publishCourseEvent(String message) {
        System.out.println("Publishing course event with message: " + message);
        publisher.publishEvent(new CourseEvent(this, message));
    }

    @Transactional()
    public void publishCourseEventForTransactional(String message) {
        System.out.println("Publishing course event with message: " + message);
        publisher.publishEvent(new CourseEventForTransactional(this, message));
    }

}
