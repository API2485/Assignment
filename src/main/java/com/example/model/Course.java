package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Course")
public class Course {
        
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CourseId")
        private Long CourseId;
    
    @Column(name="Title")
    private String Title;
    
    @Column(name="Fees")
    private Long Fees;
    
    @Column(name="Description")
    private String Description;
    
    @Column(name="Trainer")
    private String Trainer;
    
    @Column(name="Start_Date")
    private String Start_Date;
    
    
    

	public Long getCourseId() {
		return CourseId;
	}

	public void setCourseId(Long courseId) {
		CourseId = courseId;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public Long getFees() {
		return Fees;
	}

	public void setFees(Long fees) {
		Fees = fees;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getTrainer() {
		return Trainer;
	}

	public void setTrainer(String trainer) {
		Trainer = trainer;
	}

	public String getStart_Date() {
		return Start_Date;
	}

	public void setStart_Date(String start_Date) {
		Start_Date = start_Date;
	}

    
    
    
}
