package com.hrms.app.config.security.auth;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.hrms.app.core.domain.Role;
import com.hrms.app.core.domain.User;
import com.hrms.app.persistence.service.RoleService;
import com.hrms.app.persistence.service.UserService;

@Service
public class CurrentUserDetailsService implements UserDetailsService {
    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;

    @Override
    public CurrentUser loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = this.userService.getUserByUserName(username).orElseThrow(() -> new UsernameNotFoundException(String.format("User with username=%s was not found", username)));
        List<Role> roles = this.roleService.getRolesByUserName(user.getUserName());
        user.setRoles(roles);
        return new CurrentUser(user);
    }
}
