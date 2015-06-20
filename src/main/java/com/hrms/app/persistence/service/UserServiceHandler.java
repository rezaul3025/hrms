package com.hrms.app.persistence.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hrms.app.core.domain.User;
import com.hrms.app.persistence.repo.UserRepo;

@Service
@Transactional
public class UserServiceHandler implements UserService
{
	@Autowired
	private UserRepo userRepo;

	@Override
	public User getUserById(long id)
	{
		// TODO Auto-generated method stub
		return userRepo.findOne(id);
	}

	@Override
	public Optional<User> getUserByUserName(String username)
	{
		// TODO Auto-generated method stub
		return userRepo.findOneByUserName(username);
	}

	@Override
	public Collection<User> getAllUsers()
	{
		// TODO Auto-generated method stub
		return userRepo.findAll(new Sort("userName"));
	}

	@Override
	public User create(User user)
	{
		// TODO Auto-generated method stub
		user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
		return userRepo.save(user);
	}

}
