package com.shubham.flyweight;

public class HumanoidRobot implements IRobot {

	private String type;
	private Sprites body;

	@Override
	public void display(int x, int y) {
		System.out.println(this.type+" - "+this.getClass().getName()+" - "+x+" - "+y);
	}

	public HumanoidRobot(String type, Sprites body) {
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

	public HumanoidRobot() {
		super();
	}

}
