package com.blogcasestudy1.blogcasestudy2.repository;

import com.blogcasestudy1.blogcasestudy2.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findbyUserName(String username);
}
