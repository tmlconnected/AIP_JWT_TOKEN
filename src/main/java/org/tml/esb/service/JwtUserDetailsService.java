package org.tml.esb.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {
		
	@Value("${jwt.secret.username}")
	private String userid;
	
	@Value("${jwt.secret.password}")
	private String password;

	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if (userid.equals(username)) {
			return new User(username, password,
					new ArrayList<>());
		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}

}