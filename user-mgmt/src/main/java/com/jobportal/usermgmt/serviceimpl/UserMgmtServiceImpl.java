package com.jobportal.usermgmt.serviceimpl;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobportal.usermgmt.entity.User;
import com.jobportal.usermgmt.repository.UserRepository;
import com.jobportal.usermgmt.service.UserMgmtService;


@Service
public class UserMgmtServiceImpl implements UserMgmtService{
	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public List<User> getAllUsers() {
		Iterable <User> users = userRepository.findAll();
		List<User> userList = new ArrayList<User>();
		if(users!=null) {
			for(User user: users) {
				userList.add(user);
			}
		}
		return userList;
	}


	@Override
	public User createNewUser(User user) {
		return userRepository.save(user);
	}

}
