package com.springboot001.springtask.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot001.springtask.entity.Users;

public interface UserRepository extends JpaRepository<Users, Long> {

}
