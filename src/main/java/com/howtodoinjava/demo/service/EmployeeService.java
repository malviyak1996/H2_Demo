package com.howtodoinjava.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.howtodoinjava.demo.exception.RecordNotFoundException;
import com.howtodoinjava.demo.model.ActivationNotification;
import com.howtodoinjava.demo.model.ActivationNotificationEntity;
import com.howtodoinjava.demo.model.EmployeeEntity;
import com.howtodoinjava.demo.repository.ActivationNotificationRepository;
import com.howtodoinjava.demo.repository.EmployeeRepository;
 
@Service
public class EmployeeService {
     
    @Autowired
    EmployeeRepository repository;
    
    @Autowired
    ActivationNotificationRepository activeNotificationRepository;
     
    public List<EmployeeEntity> getAllEmployees()
    {
        List<EmployeeEntity> employeeList = repository.findAll();
         
        if(employeeList.size() > 0) {
            return employeeList;
        } else {
            return new ArrayList<EmployeeEntity>();
        }
    }
     
    public EmployeeEntity getEmployeeById(Long id) throws RecordNotFoundException
    {
        Optional<EmployeeEntity> employee = repository.findById(id);
         
        if(employee.isPresent()) {
            return employee.get();
        } else {
            throw new RecordNotFoundException("No employee record exist for given id");
        }
    }
     
    public ActivationNotification createOrUpdateEmployee(ActivationNotification entity) throws RecordNotFoundException
    {
    	List<ActivationNotificationEntity> activationList = activeNotificationRepository.getActivationNotificationsByOrderId(entity.getOrderId());
       if(activationList.size() > 0) {
    	   for(ActivationNotificationEntity obj:activationList) {
    		   activeNotificationRepository.updateNotificationStatus(entity.getActivationStatus(),obj.getId());
    	   }
       }
    	return null;
    }
     
    public void deleteEmployeeById(Long id) throws RecordNotFoundException
    {
        Optional<EmployeeEntity> employee = repository.findById(id);
         
        if(employee.isPresent())
        {
            repository.deleteById(id);
        } else {
            throw new RecordNotFoundException("No employee record exist for given id");
        }
    }
}