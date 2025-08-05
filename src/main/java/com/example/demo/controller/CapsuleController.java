package com.example.demo.controller;

import com.example.demo.model.Capsule;
import com.example.demo.services.CapsuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/capsules")
public class CapsuleController {

	@Autowired
	private CapsuleService service;

	@PostMapping
	public Capsule create(@RequestBody Capsule dto) {
		return service.createCapsule(dto);
	}

	@GetMapping("/{id}")
	public Capsule getById(@PathVariable int id) {
		return service.getCapsuleById(id);
	}

	@GetMapping
	public List<Capsule> getAll() {
		return service.getAllCapsule();
	}

	@PutMapping("/{id}")
	public Capsule update(@PathVariable int id, @RequestBody Capsule dto) {
		return service.updateCapsule(id, dto);
	}

	@DeleteMapping("/{id}")
	public String delete(@PathVariable int id) {
		service.deleteCapsule(id);
		return "Capsule with ID " + id + " deleted";
	}
}
