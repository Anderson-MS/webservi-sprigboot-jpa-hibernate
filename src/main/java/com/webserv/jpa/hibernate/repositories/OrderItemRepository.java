package com.webserv.jpa.hibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webserv.jpa.hibernate.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
