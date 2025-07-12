package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.DoctorEntity;

public interface DoctorRepositery extends JpaRepository<DoctorEntity, Integer>{
	
	 
}
