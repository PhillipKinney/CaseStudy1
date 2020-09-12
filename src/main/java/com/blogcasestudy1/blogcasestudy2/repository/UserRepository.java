package com.blogcasestudy1.blogcasestudy2.repository;

import com.blogcasestudy1.blogcasestudy2.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
