package comp.practice.springbootstarter.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	CourseRepository courseRepo;

	public List<Course> getAllCourses(String topicId) {
		List<Course> courses = new ArrayList<>();
		courseRepo.findByTopicId(topicId).forEach(courses::add);
		return courses;
	}

	public Course getCourse(String id) {
		return courseRepo.findById(id).get();
	}

	public void addCourse(Course course) {
		courseRepo.save(course);
	}

	public void updateCourse(Course course) {
		courseRepo.save(course);
	}

	public void deleteCourse(String id) {
		courseRepo.deleteById(id);
	}

}