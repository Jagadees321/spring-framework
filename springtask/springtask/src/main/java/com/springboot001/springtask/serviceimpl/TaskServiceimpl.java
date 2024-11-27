package com.springboot001.springtask.serviceimpl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot001.springtask.entity.Task;
import com.springboot001.springtask.entity.Users;
import com.springboot001.springtask.payload.Taskdto;
import com.springboot001.springtask.repository.TaskRepo;
import com.springboot001.springtask.repository.UserRepository;
import com.springboot001.springtask.service.TaskService;
@Service
public class TaskServiceimpl implements TaskService {
	@Autowired
    private ModelMapper modelmapper;
	@Autowired
	 private  UserRepository userRepo;
	@Autowired
	 private TaskRepo taskRepo;
	@Override
	public Taskdto saveTask(long userid, Taskdto taskdto) {
		// TODO Auto-generated method stub
		Users users=userRepo.findById(userid).get();
		Task task=modelmapper.map(taskdto, Task.class);
		task.setUsers(users);
		Task saved=taskRepo.save(task);
		
		return modelmapper.map(saved, Taskdto.class);
	}

	@Override
	public List<Taskdto> getAllTasks(long userid) {
		// TODO Auto-generated method stub
		return null;
	}

}
