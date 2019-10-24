package com.jobportal.usermgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
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
		List<User> userList=  usermgmtService.getAllUsers();
		return userList;
	}

}
