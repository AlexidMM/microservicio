package com.uteq.mx.microservicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uteq.mx.microservicio.entity.EntityA;

public interface EntityARepository extends JpaRepository<EntityA, Integer> {

}
