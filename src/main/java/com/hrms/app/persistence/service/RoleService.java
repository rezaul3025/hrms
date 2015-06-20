package com.hrms.app.persistence.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.hrms.app.core.domain.Role;

public interface RoleService {
    public Optional<Role> getRoleById(Integer var1);

    public List<Role> getRolesByUserName(String var1);

    public Collection<Role> getAllUsers();

    public Role create(Role var1);
}