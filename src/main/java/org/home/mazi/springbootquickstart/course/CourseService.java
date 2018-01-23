package org.home.mazi.springbootquickstart.course;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author MAZI_
 */
@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	List<Course> getAllCourses(String topicId) {
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId).forEach(courses::add);
		
		return courses;
	}

	Course getCourse(String id) {
		return courseRepository.findOne(id);
	}

	void addCourse(Course course) {
		courseRepository.save(course);
	}

	void updateCourse(Course course) {
		courseRepository.save(course);
	}

	void deleteCourse(String id) {
		courseRepository.delete(id);
	}
}
