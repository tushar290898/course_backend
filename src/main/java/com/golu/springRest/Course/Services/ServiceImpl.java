package com.golu.springRest.Course.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.golu.springRest.Course.Entities.Course;
import com.golu.springRest.Course.Repo.CourseRepository;


@Service
public class ServiceImpl implements CourseServices {
    
	@Autowired
	private CourseRepository repository;
	
	@Override
	public Course AddCourse(Course course) {
		
		return repository.save(course) ;
	}

	@Override
	public List<Course> GetAllcourse() {
		
		return repository.findAll();
	}

	@Override
	public Course GetById(Long id) {
		
		return repository.findById(id).get();
	}

	@Override
	public void DeleteCourse(Course course) {
	
		repository.delete(course);
		
	}

	@Override
	public Course UpdateCourse(Course course) {
		
		return repository.save(course);
	}

	public CourseRepository getRepository() {
		return repository;
	}

	public void setRepository(CourseRepository repository) {
		this.repository = repository;
	}

}
