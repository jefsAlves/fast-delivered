package com.alvesjefs.ms_users.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alvesjefs.ms_users.domain.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {

	Users findByEmail(String email);
}
