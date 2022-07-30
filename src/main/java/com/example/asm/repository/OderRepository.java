package com.example.asm.repository;

import com.example.asm.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OderRepository extends JpaRepository<Order, Long>, JpaSpecificationExecutor<Order> {
}
