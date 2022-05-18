package com.example.skb_course_hw5;

import com.example.skb_course_hw5.eventPublisher.EventPublisher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableAsync
public class SkbCourseHw5Application {

    public static void main(String[] args) {

        var context = SpringApplication.run(SkbCourseHw5Application.class, args);
        var eventPublisher = context.getBean(EventPublisher.class);
        eventPublisher.publishCourseEvent("Simple event");
        eventPublisher.publishCourseEventForTransactional("simple event for transactional");
        eventPublisher.publishCourseEventForTransactional("event for transactional with error");
    }

}
