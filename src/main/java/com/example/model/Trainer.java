package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Trainer")
public class Trainer {
        
	@Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="TrainerId")
        private Long TrainerId;
    
    @Column(name="Password")
    private String Password;

	public Long getTrainerId() {
		return TrainerId;
	}

	public void setTrainerId(Long trainerId) {
		TrainerId = trainerId;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
    
    
    

    
    
    
}
