package com.hrms.app.persistence.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hrms.app.core.domain.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long>
{
	Optional<User> findOneByUserName(String username);
}
