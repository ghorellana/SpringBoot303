package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    CourseRepository repository;
    @Override
    public void run(String... strings) throws Exception{
        Course course = new Course("Astrophysics", "Neil D Tyson", "Just a Course", 3);
        repository.save(course);

        course = new Course("Calculus", "Carol", "Rate of Change", 3);
        repository.save(course);

        course = new Course("English", "Pegram", "Learn Language", 3);
        repository.save(course);
    }
}
