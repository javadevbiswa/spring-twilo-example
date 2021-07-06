package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;

/**
 * 
 * @author Biswa Bhusan Sahoo
 *
 */
@Entity
@Table(name = "student")
@Data
public class Student implements Serializable {

	@Transient
	private static final long serialVersionUID = 5002934473374748413L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String resgistrationNum;
	private Date registrationDate;
	private String mobileNumber;
	private int otp;

}
