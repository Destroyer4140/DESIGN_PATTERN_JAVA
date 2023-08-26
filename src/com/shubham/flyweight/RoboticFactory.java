package com.shubham.flyweight;

import java.util.HashMap;
import java.util.Map;

public class RoboticFactory {
	
	public static Map<String, IRobot> roboticObjectCache = new HashMap<String, IRobot>();
	
	public static IRobot createRobot(String robotType) {
		if(roboticObjectCache.containsKey(robotType)) {
			return roboticObjectCache.get(robotType);
		}else {
			if(robotType.equals("HUMANOID")) {
				Sprites humanoidSprite = new Sprites();
				IRobot humanoidRobot = new HumanoidRobot(robotType, humanoidSprite);
				roboticObjectCache.put(robotType, humanoidRobot);
				return humanoidRobot;
				
			}else if(robotType.endsWith("ROBOTICDOG")) {
				Sprites roboticDog = new Sprites();
				IRobot roboticDogRobot = new RoboticDog(robotType, roboticDog);
				roboticObjectCache.put(robotType, roboticDogRobot);
				return roboticDogRobot;
			}
		}
		return null;
	}

}
