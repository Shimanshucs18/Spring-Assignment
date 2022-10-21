package com.assignment.Spring1.Question6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AssignmentApplication {
    private static Logger LOGGER = LoggerFactory.getLogger(AssignmentApplication.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(AssignmentApplication.class, args);
        Question6.BinarySearchImpl binarysearchimpl = applicationContext.getBean(Question6.BinarySearchImpl.class);

        System.out.println(applicationContext.getApplicationName());
        System.out.println(applicationContext.getId());
        System.out.println(applicationContext.getDisplayName());
        System.out.println("Found at index - "+binarysearchimpl.binarySearch(new int[]{10, 4, 5, 6, 89, 7}, 89));
    }

}
