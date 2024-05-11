package org.ramesh9705.springBootBasicWebApplicationCourse.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController
{
	@RequestMapping("/courses") //Add Spring Web Dependency in pom.xml
	public List<Course> courseData()
	{
		return Arrays.asList(
				new Course(1, "Morals", "Ramesh"),
				new Course(1, "Ethics", "Ramesh"),
				new Course(1, "Values", "Ramesh")
				);
		
	}
	
}
