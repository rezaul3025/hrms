package com.hrms.app.persistence.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hrms.app.core.domain.Role;
import com.hrms.app.persistence.repo.RoleRepo;

@Service
@Transactional
public class RoleServiceHandler implements RoleService {
	
    @Autowired
    private RoleRepo roleRepo;

    @Override
    public Optional<Role> getRoleById(Integer id) {
        return Optional.ofNullable((Role)this.roleRepo.findOne(id));
    }

    @Override
    public List<Role> getRolesByUserName(String userName) {
        return this.roleRepo.findRolesByUser(userName);
    }

    @Override
    public Collection<Role> getAllUsers() {
        return this.roleRepo.findAll();
    }

    @Override
    public Role create(Role form) {
        return (Role)this.roleRepo.save(form);
    }
}
