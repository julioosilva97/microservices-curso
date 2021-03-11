package com.julioosilva97.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.julioosilva97.hruser.entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{
	
	User findByEmail(String email);
}
