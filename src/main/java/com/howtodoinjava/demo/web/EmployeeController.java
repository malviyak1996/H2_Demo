package com.howtodoinjava.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.howtodoinjava.demo.exception.RecordNotFoundException;
import com.howtodoinjava.demo.model.ActivationNotification;
import com.howtodoinjava.demo.model.EmployeeEntity;
import com.howtodoinjava.demo.service.EmployeeService;
 
@RestController
@RequestMapping("/employees")
@CrossOrigin("*")
public class EmployeeController
{
    @Autowired
    EmployeeService service;
 
 
    @PutMapping(value = "/activationNotifications", produces = "application/json")
    public ResponseEntity<ActivationNotification> createOrUpdateNotification(ActivationNotification employee)
                                                    throws RecordNotFoundException {
    	ActivationNotification updated = service.createOrUpdateEmployee(employee);
        return new ResponseEntity<ActivationNotification>(updated, new HttpHeaders(), HttpStatus.OK);
    }
 
  
 
}