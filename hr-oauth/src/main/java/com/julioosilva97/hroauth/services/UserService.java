package com.julioosilva97.hroauth.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ctc.wstx.util.SymbolTable;
import com.julioosilva97.hroauth.entities.User;
import com.julioosilva97.hroauth.faignclients.UserFeignClient;

@Service
public class UserService implements UserDetailsService {
	
	@Autowired
	private UserFeignClient userFeignClient;
	
	public User findByEmail(String email) {
		User user = userFeignClient.findByEmail(email).getBody();
		
		if(user == null)  throw new IllegalArgumentException("Email not found");
		
		return user;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
         User user = userFeignClient.findByEmail(username).getBody();
		System.out.println(user);
		if(user == null)  throw new UsernameNotFoundException("Email not found");
		
		return user;
	}

}
