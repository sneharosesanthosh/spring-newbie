package com.sneha;

import com.sneha.model.Course;
import com.sneha.model.Student;
import com.sneha.service.CourseService;
import com.sneha.service.CrudService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Application {
    public static void main(String[] args) {
        System.out.println("Hello spring!!");


        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        CrudService crudService = context.getBean("courseService", CourseService.class);
        Course course = context.getBean("course", Course.class);
        course.display();
//        System.out.println(crudService.list());
        Student stud1 = context.getBean("noel", Student.class);
        stud1.studentCheating("noel");
        Student stud2 = context.getBean("joel", Student.class);
        stud2.studentCheating("joel");
    }




}
