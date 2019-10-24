package com.jobportal.usermgmt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jobportal.usermgmt.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {

}
