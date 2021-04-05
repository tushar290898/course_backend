package com.golu.springRest.Course.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.golu.springRest.Course.Entities.Course;

public interface CourseRepository extends JpaRepository<Course,Long> {

}
