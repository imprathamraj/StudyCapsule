package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Capsule {
	@Id
	@GeneratedValue
	private int capsuleId;
	private String capsuleType;
	private double capsulePrice;

	public int getCapsuleId() {
		return capsuleId;
	}

	public void setCapsuleId(int capsuleId) {
		this.capsuleId = capsuleId;
	}

	public String getCapsuleType() {
		return capsuleType;
	}

	public void setCapsuleType(String capsuleType) {
		this.capsuleType = capsuleType;
	}

	public double getCapsulePrice() {
		return capsulePrice;
	}

	public void setCapsulePrice(double capsulePrice) {
		this.capsulePrice = capsulePrice;
	}

	@Override
	public String toString() {
		return "Capsule [capsuleId=" + capsuleId + ", capsuleType=" + capsuleType + ", capsulePrice=" + capsulePrice
				+ "]";
	}

}
