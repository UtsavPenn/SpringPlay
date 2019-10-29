package com.jobportal.usermgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.jobportal.usermgmt.entity.User;

import com.jobportal.usermgmt.service.UserMgmtService;

@RestController
public class UserMgmtController {
	@Autowired
	private UserMgmtService usermgmtService;
	
	@RequestMapping("/get-all-users")
	public  List<User> getAllUsers() {
		return usermgmtService.getAllUsers();
	}
	
	@RequestMapping(method = RequestMethod.POST,path="/register")
	public User createNewUser(@RequestBody User user){
		return usermgmtService.createNewUser(user);
	}

}
