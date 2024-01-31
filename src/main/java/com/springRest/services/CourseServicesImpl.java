package com.springRest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springRest.Dao.CourseDao;
import com.springRest.entities.Course;


@Service
public class CourseServicesImpl implements CourseService{
	
	@Autowired
	private CourseDao courseDao;
	
//List<Course> list;
	public CourseServicesImpl() {
//		list = new ArrayList<>();
//		list.add(new Course(145,"Java Spring","Spring boot is ready to use java development"));
//		list.add(new Course(123,"REST course", "This contains basics of REST"));
	}
	
	@Override
	public List<Course> getCourses() {
		
	

		return courseDao.findAll(); 
	}

	@Override
	public Course getCourse(long courseId) {
//		Course c = null;
//		for(Course course : list)
//		{
//			if(course.getId()==courseId)
//			{
//				c=course;
//				break;
//			}
//		}
//		return c;
		
		return courseDao.getReferenceById(courseId);
	}

	@Override
	public Course addCourse(Course course) {
//		list.add(course);
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
//		list.forEach(e-> {
//			if(e.getId() == course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
//		return course;
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
//		list = this.list.stream().filter(e-> e.getId()!= parseLong).collect(Collectors.toList());
		
		Course entity = courseDao.getReferenceById(parseLong);
		courseDao.delete(entity);
	}

	

}
