package com.sneha.repository;

import com.sneha.model.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseRepository implements CrudRepository{

    @Override
    public List findAll() {
        List<Course> courses = new ArrayList<>();
        Course course = new Course(1, "Vanilla Spring introduction", "An complete intro to SPRING", "http://localhost:9090");
        courses.add(course);
        return courses;
    }
}
