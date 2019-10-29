package com.jobportal.usermgmt.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jobportal.usermgmt.entity.User;

public interface  UserMgmtService {
	public List<User> getAllUsers();
	public User createNewUser(User user);

}
