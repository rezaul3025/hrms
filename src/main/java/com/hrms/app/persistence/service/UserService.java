package com.hrms.app.persistence.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.hrms.app.core.domain.User;

public interface UserService
{
	User getUserById(long id);

	Optional<User> getUserByUserName(String userName);

    Collection<User> getAllUsers();

    User create(User form);
}
