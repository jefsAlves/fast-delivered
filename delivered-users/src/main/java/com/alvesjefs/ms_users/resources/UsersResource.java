package com.alvesjefs.ms_users.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alvesjefs.ms_users.domain.Users;
import com.alvesjefs.ms_users.dto.UsersDTO;
import com.alvesjefs.ms_users.services.UsersService;

@RestController
@RequestMapping(value = "api/users")
public class UsersResource {

	@Autowired
	private UsersService usersService;

	@GetMapping
	public ResponseEntity<List<UsersDTO>> findAll() {
		List<UsersDTO> users = usersService.findAll();
		return ResponseEntity.ok().body(users);
	}

	@GetMapping(value = "/searchEmail")
	public ResponseEntity<Users> findByEmail(@RequestParam String email) {
		Users users = usersService.findByEmail(email);
		return ResponseEntity.ok().body(users);
	}

}
