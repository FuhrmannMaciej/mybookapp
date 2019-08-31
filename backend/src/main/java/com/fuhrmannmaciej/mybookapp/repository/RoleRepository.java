package com.fuhrmannmaciej.mybookapp.repository;

import com.fuhrmannmaciej.mybookapp.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
