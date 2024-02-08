package com.myblog.com.myblog11.repository;


import com.myblog.com.myblog11.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
}
