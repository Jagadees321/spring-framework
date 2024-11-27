package com.springboot001.springtask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot001.springtask.payload.Taskdto;
import com.springboot001.springtask.service.TaskService;

@RestController
@RequestMapping("/api")
public class Tashcontroller {
	@Autowired
	private TaskService taskservice;
    //save the task
	@PostMapping("/{userid}/tasks")
	public ResponseEntity<Taskdto> saveTask(@PathVariable(name="userid") long userid,
			@RequestBody Taskdto taskdto ){
		//System.out.println(taskdto.getName()+"   hello");
				return new ResponseEntity<Taskdto>(taskservice.saveTask(userid, taskdto),HttpStatus.CREATED);
		
	}
	
	//get the task
	//get index task
	// delete index task
}
