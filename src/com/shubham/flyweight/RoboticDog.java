package com.shubham.flyweight;

public class RoboticDog implements IRobot {

	private String type;
	private Sprites body;

	public RoboticDog() {
		super();
	}

	public RoboticDog(String type, Sprites body) {
		super();
		this.type = type;
		this.body = body;
	}

	public String getType() {
		return type;
	}

	public Sprites getBody() {
		return body;
	}

	@Override
	public void display(int x, int y) {
		System.out.println(this.type+" - "+this.getClass().getName()+" - "+x+" - "+y);
	}

}
