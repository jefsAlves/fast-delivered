package com.alvesjefs.ms_oauth.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.alvesjefs.ms_oauth.domain.Users;
import com.alvesjefs.ms_oauth.feignclients.UsersFeignClient;
import com.alvesjefs.ms_oauth.services.exceptions.ObjectNotFoundException;

@Service
public class UsersService implements UserDetailsService {

	@Autowired
	private UsersFeignClient usersFeignClient;

	public Users findByEmail(String email) {
		Users users = usersFeignClient.findByEmail(email).getBody();
		if (users == null) {
			throw new ObjectNotFoundException("Email not found!");
		}

		return users;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Users users = usersFeignClient.findByEmail(username).getBody();
		if (users == null) {
			throw new UsernameNotFoundException("Email not found!");
		}

		return users;
	}
}
