package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CapsuleRepository;
import com.example.demo.model.Capsule;

@Service
public class CapsuleServiceImp implements CapsuleService {

	@Autowired
	private CapsuleRepository repo;

	@Override
	public Capsule createCapsule(Capsule capsule) {

		return repo.save(capsule);
	}

	@Override
	public Capsule getCapsuleById(int capsuleId) {
		Optional<Capsule> capsule = repo.findById(capsuleId);
		return capsule.orElse(null);
	}

	@Override
	public List<Capsule> getAllCapsule() {
		return repo.findAll();
	}

	@Override
	public Capsule updateCapsule(int capsuleId, Capsule capsule) {
		if (repo.existsById(capsuleId)) {
			capsule.setCapsuleId(capsuleId);
			return repo.save(capsule);
		}
		return null;
	}

	@Override
	public void deleteCapsule(int capsuleId) {
		if (repo.existsById(capsuleId)) {
			repo.deleteById(capsuleId);
		}

	}

}
