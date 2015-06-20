package com.hrms.app.persistence.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hrms.app.core.domain.Role;

@Repository
public interface RoleRepo
extends JpaRepository<Role, Integer> {
    @Query(value="SELECT * from user_role where username=:userName", nativeQuery=true)
    public List<Role> findRolesByUser(@Param(value="userName") String var1);
}
