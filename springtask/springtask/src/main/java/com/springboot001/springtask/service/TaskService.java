package com.springboot001.springtask.service;

import java.util.List;

import com.springboot001.springtask.payload.Taskdto;

public interface TaskService {
   public Taskdto saveTask(long userid,Taskdto taskdto);
   public List<Taskdto> getAllTasks(long userid);
}
