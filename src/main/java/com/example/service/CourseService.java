package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Course;
import com.example.repository.CourseRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

        @Autowired
            CourseRepository courseRepository;  
        
        
        // creating 
        public Course createCourse(Course c) {
         return courseRepository.save(c);
        }

        
        
        //read getbyAll
        public List<Course> getCourse() {
            return courseRepository.findAll();
        }

        
        public Optional<Course> getCourseById(Long CourseId) {
            return (Optional<Course>) courseRepository.findById(CourseId);
        }
        
        
        //delete
        public void deleteCourse(Long courseId) {
        	courseRepository.deleteById(courseId);
        }
        
//         // update
//        public Course updateCourse(Long courseId, Course courseDetails) {
//                Course c = courseRepository.findById(courseId).get();
//                c.setTitle(courseDetails.getTitle());
//                c.setFees(courseDetails.getFees());
//                c.setDescription(courseDetails.getDescription());
//                c.setTrainer(courseDetails.getTrainer());
//                c.setStart_Date(courseDetails.getStart_Date());
//                
//                return courseRepository.save(c);                                
//        }

        

}
