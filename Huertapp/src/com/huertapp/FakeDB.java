package com.huertapp;

import java.util.LinkedList;
import java.util.List;

import com.huertapp.model.Crop;
import com.huertapp.model.Garden;

public class FakeDB {

	public static List<Garden> gardens= new LinkedList<Garden>();
	
	public static List<Crop> crops= new LinkedList<Crop>();
	
	static{
		gardens.add(new Garden("Balcón", "Interior, Cantero - 1.5m x 2m"));
		gardens.add(new Garden("Terraza", "Exterior- 4.5m x 6m"));
		
		crops.add(new Crop("Tomate", "Hortaliza"));
		crops.add(new Crop("Lechuga", "Raiz"));
	}

	public static List<Garden> getGardens() {
		return gardens;
	}

	public static List<Crop> getCrops() {
		return crops;
	}
	
	public static void addGarden(Garden garden){
		gardens.add(garden);
	}
	
	public static void addCrop(Crop crop){
		crops.add(crop);
	}
	
}
