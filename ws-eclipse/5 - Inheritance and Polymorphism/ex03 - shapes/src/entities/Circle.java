package entities;

import entities.enums.Color;

public class Circle extends Shape {
	
	private Double radius;
	
	public Circle() {
	}

	public Circle(Color color, Double radious) {
		super(color);
		this.radius = radious;
	}

	public Double getRadious() {
		return radius;
	}

	public void setRadious(Double radious) {
		this.radius = radious;
	}
	
	@Override
	public double area() {
		 return Math.PI * radius * radius;
	}

}
