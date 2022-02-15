package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Trainer;
import com.example.repository.TrainerRepository;

import java.util.List;

@Service
public class TrainerService {

        @Autowired
        TrainerRepository tRepository;  
        
        
        // creating 
        public Trainer createTrainer(Trainer t) {
         return tRepository.save(t);
        }

        
        
        //read getbyAll
        public List<Trainer> getTrainer() {
            return tRepository.findAll();
        }
        
         // update
        public Trainer updateTrainer(Long TrainerId, Trainer tDetails) {
        		Trainer t = tRepository.findById(TrainerId).get();
                t.setPassword(tDetails.getPassword());
                
                return tRepository.save(t);                                
        }

        

}
