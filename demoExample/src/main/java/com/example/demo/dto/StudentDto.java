package com.example.demo.dto;

import java.util.Date;

import lombok.Data;

@Data
public class StudentDto {
	private int id;
	private String name;
	private String resgistrationNum;
	private Date registrationDate;
	private String mobileNumber;
}