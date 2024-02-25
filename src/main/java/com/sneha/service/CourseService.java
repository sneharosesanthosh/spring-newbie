package com.sneha.service;

import com.sneha.model.Course;
import com.sneha.repository.CourseRepository;

import java.util.List;
import java.util.Optional;

public class CourseService implements CrudService{
    private CourseRepository courseRepository;
    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public List list() {
        return courseRepository.findAll();
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
