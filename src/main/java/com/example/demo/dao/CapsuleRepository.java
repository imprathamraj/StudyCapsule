package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Capsule;

@Repository
public interface CapsuleRepository extends JpaRepository<Capsule, Integer> {

}
