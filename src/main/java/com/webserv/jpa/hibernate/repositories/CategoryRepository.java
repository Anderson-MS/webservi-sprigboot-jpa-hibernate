package com.webserv.jpa.hibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webserv.jpa.hibernate.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
