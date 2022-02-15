package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Trainer;
import com.example.service.TrainerService;

@RestController
@RequestMapping("/api")
public class TrainerController {
        @Autowired
        TrainerService tService;
        
        @RequestMapping(value="/Trainer", method=RequestMethod.POST)
        public Trainer createTrainer(@RequestBody Trainer t) {
            return tService.createTrainer(t);
        }
        
        @RequestMapping(value="/Trainer", method=RequestMethod.GET)
        public List<Trainer> readTrainer() {
            return tService.getTrainer();
        }
        

        @RequestMapping(value="/Trainer/{TrainerId}", method=RequestMethod.PUT)
        public Trainer readTrainer(@PathVariable(value = "TrainerId") Long TrainerId, @RequestBody Trainer tDetails) {
            return tService.updateTrainer(TrainerId, tDetails);
        }



        

}
