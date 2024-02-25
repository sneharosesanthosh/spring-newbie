package com.sneha;

import com.sneha.config.AppConfig;
import com.sneha.model.Course;
import com.sneha.service.CourseService;
import com.sneha.service.CrudService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Application {
    public static void main(String[] args) {
        System.out.println("Hello spring!!");


        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CrudService crudService = context.getBean("courseService", CourseService.class);
        System.out.println(crudService.list());
    }




}
