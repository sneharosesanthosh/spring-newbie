package com.sneha;

import com.sneha.model.Course;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CourseService implements CrudService{

    private List<Course> courses;
    public CourseService() {
        Course course = new Course(1, "Vanilla Spring introduction", "An complete intro to SPRING", "http://localhost:9090");
        courses.add(course);
    }

    @Override
    public List list() {
        return courses;
    }

    @Override
    public Object create(Object o) {
        return null;
    }

    @Override
    public Optional get(int id) {
        return Optional.empty();
    }

    @Override
    public void update(Object o, int id) {

    }

    @Override
    public void delete(int id) {

    }
}
