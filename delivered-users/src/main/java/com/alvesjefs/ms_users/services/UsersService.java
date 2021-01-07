package com.alvesjefs.ms_users.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alvesjefs.ms_users.domain.Users;
import com.alvesjefs.ms_users.dto.UsersDTO;
import com.alvesjefs.ms_users.repositories.UsersRepository;

@Service
public class UsersService {

	@Autowired
	private UsersRepository usersRepository;

	public List<UsersDTO> findAll() {
		List<Users> users = usersRepository.findAll();
		return users.stream().map(x -> new UsersDTO(x)).collect(Collectors.toList());
	}

	public Users findByEmail(String email) {
		Users findEmail = usersRepository.findByEmail(email);
		return findEmail;
	}
}
