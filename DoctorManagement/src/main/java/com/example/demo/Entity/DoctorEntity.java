package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class DoctorEntity {
	@Id
	private int dr_id;
	private String dr_name;
	private String dr_address;
	private String dr_degree;
	private String dr_spalization;
	private String dr_mobile;
	
	public int getDr_id() {
		return dr_id;
	}
	public void setDr_id(int dr_id) {
		this.dr_id = dr_id;
	}
	public String getDr_name() {
		return dr_name;
	}
	public void setDr_name(String dr_name) {
		this.dr_name = dr_name;
	}
	public String getDr_address() {
		return dr_address;
	}
	public void setDr_address(String dr_address) {
		this.dr_address = dr_address;
	}
	public String getDr_degree() {
		return dr_degree;
	}
	public void setDr_degree(String dr_degree) {
		this.dr_degree = dr_degree;
	}
	public String getDr_spalization() {
		return dr_spalization;
	}
	public void setDr_spalization(String dr_spalization) {
		this.dr_spalization = dr_spalization;
	}
	public String getDr_mobile() {
		return dr_mobile;
	}
	public void setDr_mobile(String dr_mobile) {
		this.dr_mobile = dr_mobile;
	}

}
