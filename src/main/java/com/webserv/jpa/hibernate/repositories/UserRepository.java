package com.webserv.jpa.hibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webserv.jpa.hibernate.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
