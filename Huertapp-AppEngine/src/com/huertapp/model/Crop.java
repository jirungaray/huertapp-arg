package com.huertapp.model;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

@Entity
public class Crop {

	@Id
	private Long id;
	
	@Index
	private long gardenId;
	
	private String name;
	
	private String type;
	
	private String variety;
	
	private int amount;
	
	private Crop() {
		// TODO Auto-generated constructor stub
	}

	public Crop(long gardenId, String name, String type, String variety,
			int amount) {
		super();
		this.gardenId = gardenId;
		this.name = name;
		this.type = type;
		this.variety = variety;
		this.amount = amount;
	}

	public long getId() {
		return id;
	}

	public long getGardenId() {
		return gardenId;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getVariety() {
		return variety;
	}

	public int getAmount() {
		return amount;
	}
	
	
}
