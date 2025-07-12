package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.DoctorEntity;
import com.example.demo.Repo.DoctorRepositery;


@Service
public class DoctorService {
	

	@Autowired
	DoctorRepositery doctorRepositery;
	
		public void addDoctor(DoctorEntity dr) {
			
			doctorRepositery.save(dr);
			

		}
		
		public void delDoctor(int d_id) {
			
			doctorRepositery.deleteById(d_id);
			
		}
		
		
		

		

	
}
	
