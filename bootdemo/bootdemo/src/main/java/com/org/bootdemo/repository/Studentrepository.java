package com.org.bootdemo.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.bootdemo.dto.Student;

public interface Studentrepository extends JpaRepository<Student, Integer> {
    List<Student> findByName(String name);
    List<Student> findByAgeGreaterThan(int age) ;
    List<Student> findByAgeLessThan(int age) ;
    Student findByMoblienum(long mnum);
    
}
