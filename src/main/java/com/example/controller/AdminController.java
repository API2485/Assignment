package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Course;
import com.example.service.CourseService;

@RestController
@RequestMapping("/api")
public class AdminController {
        @Autowired
        CourseService courseService;
        
        
        @RequestMapping(value="/Admin", method=RequestMethod.GET)
        public List<Course> readCourse() {
            return courseService.getCourse();
        }
        
        @RequestMapping(value="/Admin/{CourseId}", method=RequestMethod.GET)
        public Optional<Course> readCourseById(@PathVariable(value = "CourseId") Long CourseId) {
            return courseService.getCourseById(CourseId);
        }



        

}
