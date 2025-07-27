package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Capsule;

public interface CapsuleService {
	Capsule createCapsule(Capsule capsule);
	Capsule getCapsuleById(int capsuleId);
	List<Capsule> getAllCapsule();
	Capsule updateCapsule(int capsuleId, Capsule capsule);
	void deleteCapsule(int capsuleId);
}
