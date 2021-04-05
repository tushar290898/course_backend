package com.golu.springRest.Course.Services;

import java.util.List;

import com.golu.springRest.Course.Entities.Course;

public interface CourseServices {
	
	public Course AddCourse(Course course);
	public List<Course> GetAllcourse();
	public Course GetById(Long id);
	public void DeleteCourse(Course course);
	public Course UpdateCourse(Course course);

}
