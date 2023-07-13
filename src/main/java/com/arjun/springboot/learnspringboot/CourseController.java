package com.arjun.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses(){
		
		return Arrays.asList(
				new Course(11, "Learn SpringBoot", "Malli"),
				new Course(12,"Learn AWS", "arjun"),
				new Course(13, "Learn Microservices", "Suleman"),
				new Course(13, "Learn Microservices", "Sailu")
				);
				
	}

}
