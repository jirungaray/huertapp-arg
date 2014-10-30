package com.huertapp.model;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;


@Entity
public class Garden {

	public static final int TYPE_FLOWER_POT=1; 
	public static final int TYPE_HIDROPONIC=2; 
	public static final int TYPE_OPEN_LAND=3; 
	public static final int TYPE_GREEN_HOUSE=4; 
	
	@Id
	private Long id;
	
	private String name;
	
	private boolean directLight;
	
	private int lightHoursADay;
	
	private float width;
	
	private float length;
	
	private boolean outerGarden;
	
	private String type;

	private Garden(){
		
	}
	public Garden(String name, boolean directLight, int lightHoursADay,
			float width, float height, boolean outerGarden, String gardenType) {
		super();
		this.name = name;
		this.directLight = directLight;
		this.lightHoursADay = lightHoursADay;
		this.width = width;
		this.length = height;
		this.outerGarden = outerGarden;
		this.type = gardenType;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public boolean isDirectLight() {
		return directLight;
	}

	public int getLightHoursADay() {
		return lightHoursADay;
	}

	public float getWidth() {
		return width;
	}

	public float getLength() {
		return length;
	}

	public boolean isOuterGarden() {
		return outerGarden;
	}

	public String getType() {
		return type;
	}
	
	
	
}
