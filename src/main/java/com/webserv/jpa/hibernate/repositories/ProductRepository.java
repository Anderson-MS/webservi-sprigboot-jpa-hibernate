package com.webserv.jpa.hibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webserv.jpa.hibernate.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
