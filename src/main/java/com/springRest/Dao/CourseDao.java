package com.springRest.Dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springRest.entities.Course;
@Repository
public interface CourseDao extends JpaRepository<Course,Long>{

	

}
