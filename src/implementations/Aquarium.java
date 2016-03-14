package implementations;

import java.awt.Color;
import java.util.ArrayList;

import interfaces.IAquarium;
import interfaces.IPoisson;

public class Aquarium implements IAquarium{
private int width;
private int length;
private int speed;
private Color waterColor;
private ArrayList<? extends IPoisson> poissons;

	public void addPoisson(IPoisson poisson) {
		
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Color getWaterColor() {
		return waterColor;
	}

	public void setWaterColor(Color waterColor) {
		this.waterColor = waterColor;
	}

	public ArrayList<? extends IPoisson> getPoissons() {
		return poissons;
	}

	public void setPoissons(ArrayList<? extends IPoisson> poissons) {
		this.poissons = poissons;
	}


	



}
