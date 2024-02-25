package com.sneha.config;

import com.sneha.repository.CourseRepository;
import com.sneha.service.CourseService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {


    @Bean(name = "courseRepository")
    public CourseRepository courseRepository() {
        return new CourseRepository();
    }

    @Bean(name = "courseService")
    public CourseService courseService() {
        return new CourseService(courseRepository());
    }
}
