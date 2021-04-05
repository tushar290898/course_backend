package com.golu.springRest.Course.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.golu.springRest.Course.Entities.Course;
import com.golu.springRest.Course.Services.CourseServices;


@CrossOrigin(origins="http://localhost:3000")
@RestController
public class CourseRest {
	
	@Autowired
	private CourseServices service;
	
	@PostMapping("/course")
	public Course AddCourse(@RequestBody Course course) {
		return service.AddCourse(course);
		
	}
	
	@GetMapping("/courses")
	public List<Course> AllCourses(){
		return service.GetAllcourse();
	}
	
	@GetMapping("/course/{id}")
	public Course GetByOne(@PathVariable Long id) {
		return service.GetById(id);
	}
	
	@DeleteMapping("/course/{id}")
	public void deleteCourse(@PathVariable Long id) {
		Course courseid = service.GetById(id);
	    service.DeleteCourse(courseid);
	}
	@PutMapping("/course")
	public Course updateCourse(@RequestBody Course course) {
		return service.UpdateCourse(course);
	}

}
