package com.example.demo.service;

import static com.example.demo.service.SmsService.sendOtp;

import java.util.Date;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.example.demo.dto.StudentDto;
import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRegistrationRepository;

/**
 * 
 * @author biswa
 *
 */

@Service
public class StudentRegistrationService {

	@Autowired
	private StudentRegistrationRepository repository;

	@Autowired
	private ModelMapper modelMapper;

	public StudentDto registerStudent(StudentDto studentDto) {

		String name = studentDto.getName();
		Assert.notNull(name, "Student Name Can not be null");

		Student student = modelMapper.map(studentDto, Student.class);

		String registrationNum = "TCS-" + UUID.randomUUID().toString();

		int otp = sendOtp(studentDto.getMobileNumber(), "Hi " + name + " !  , You OTP has sent . ");

		student.setResgistrationNum(registrationNum);
		student.setRegistrationDate(new Date());
		student.setOtp(otp);

		Student createdStudent = repository.save(student);
		StudentDto registeredStudent = modelMapper.map(createdStudent, StudentDto.class);
		System.out.println("Sudent Reegistered :: " + studentDto);
		return registeredStudent;
	}
}
