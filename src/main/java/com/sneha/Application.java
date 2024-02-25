package com.sneha;

import com.sneha.model.Course;
import com.sneha.service.CourseService;
import com.sneha.service.CrudService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
public class Application {
    public static void main(String[] args) {
        System.out.println("Hello spring!!");


        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        CrudService crudService = context.getBean("courseService", CourseService.class);
        Course course = context.getBean("course", Course.class);
        course.display();
//        System.out.println(crudService.list());
    }




}
