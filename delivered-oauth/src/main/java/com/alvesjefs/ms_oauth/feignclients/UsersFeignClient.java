package com.alvesjefs.ms_oauth.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.alvesjefs.ms_oauth.domain.Users;

@FeignClient(name = "delivered-users", path = "api/users")
@Component
public interface UsersFeignClient {

	@GetMapping(value = "/searchEmail")
	ResponseEntity<Users> findByEmail(@RequestParam String email);

}
