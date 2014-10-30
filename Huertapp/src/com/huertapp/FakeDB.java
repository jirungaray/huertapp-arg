package com.huertapp;

import java.util.LinkedList;
import java.util.List;

import com.huertapp.model.Crop;

public class FakeDB {

	
	public static List<Crop> crops= new LinkedList<Crop>();
	
	static{
		
		crops.add(new Crop("Tomate", "Hortaliza"));
		crops.add(new Crop("Lechuga", "Raiz"));
	}

	

	public static List<Crop> getCrops() {
		return crops;
	}

	public static void addCrop(Crop crop){
		crops.add(crop);
	}
	
}
