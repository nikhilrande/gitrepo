package com.example.demo.Controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.DoctorEntity;
import com.example.demo.Service.DoctorService;

@RestController
public class DoctorControler {
	
	
     @Autowired
	DoctorService dr;

     @PostMapping ("Adddoctor") 
	public String addDoctor (@RequestBody DoctorEntity d) {
		
    	 dr.addDoctor(d);
    	 
		return "Doctor added";
		
	}
     
     @DeleteMapping("doctor/{d_id}")
     public String delDoctor(@PathVariable int d_id) {
    	 
    	 dr.delDoctor(d_id);
    	 return "Delete Doctor";
    	 
     }
	

	
	
	
	
}
