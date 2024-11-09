package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface userInterface extends JpaRepository<User, String > {

	public  User findByEmail(String email);
}
