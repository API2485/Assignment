package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Course;
import com.example.service.CourseService;

@RestController
@RequestMapping("/api")
public class StudentController {
        @Autowired
        CourseService courseService;
        
        @RequestMapping(value="/Student", method=RequestMethod.POST)
        public Course createCourse(@RequestBody Course c) {
            return courseService.createCourse(c);
        }
        
        @RequestMapping(value="/Student", method=RequestMethod.GET)
        public List<Course> readCourse() {
            return courseService.getCourse();
        }
        

        @RequestMapping(value="/Student/{CourseId}", method=RequestMethod.DELETE)
        public void deleteCourse(@PathVariable(value = "CourseId") Long CourseId) {
        	courseService.deleteCourse(CourseId);
        }


        

}

