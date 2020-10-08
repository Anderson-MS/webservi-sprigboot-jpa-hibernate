package com.webserv.jpa.hibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webserv.jpa.hibernate.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
