package com.kenan.studentmanagementsystem.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.kenan.studentmanagementsystem.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

	
}
