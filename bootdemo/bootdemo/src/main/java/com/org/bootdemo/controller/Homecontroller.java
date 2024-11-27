package com.org.bootdemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.bootdemo.dto.Student;
import com.org.bootdemo.repository.Studentrepository;

@RestController
@RequestMapping("/student")
public class Homecontroller {
     @Autowired
     Studentrepository repository;
//	
	@PostMapping
    public String savestudentdata(@RequestBody Student student) {		
		repository.save(student);
    	return "data saved";
    }
     @GetMapping
     @CrossOrigin(origins = "http://127.0.0.1:5501")
	 public List<Student> getstudentdata() {		
			
	    	return repository.findAll() ;
	    }
     @PutMapping("/{id}")
	 public Student putstudentdata(@PathVariable int id,@RequestBody Student student) {		
			Student s=repository.findById(id).get();
	        s.setName(student.getName());
	        s.setAge(student.getAge());
	        s.setMoblienum(student.getMoblienum());
			repository.save(s);
	    	return s;
	    }
     @DeleteMapping("/{id}")
	 public String deletestudentdata(@PathVariable int id) {		
			repository.deleteById(id);
			return "data deleted successfully";
	    }
}
