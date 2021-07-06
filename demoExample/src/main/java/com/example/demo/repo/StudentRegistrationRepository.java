package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;

/**
 * 
 * @author biswa
 *
 */
@Repository
public interface StudentRegistrationRepository extends JpaRepository<Student, Integer> {

}
