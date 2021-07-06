package com.example.demo.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 
 * @author Biswa Bhusan Sahoo
 * 
 *
 */
@Data
public class StudentDto implements Serializable {
	
	private static final long serialVersionUID = -1472313559996099167L;

	private int id;
	private String name;
	private String resgistrationNum;
	private Date registrationDate;
	private String mobileNumber;
}