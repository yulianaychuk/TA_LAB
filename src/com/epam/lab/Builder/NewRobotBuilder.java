package com.epam.lab.builder;
public class NewRobotBuilder implements RobotBuilder{
	private Robot robot;
	public NewRobotBuilder() {
		this.robot = new Robot(); 
	}
	@Override
	public void buildRobotHead() {
		robot.setRobotHead("Kevlar Head");
	}

	@Override
	public void buildRobotTorso() {
		robot.setRobotTorso("Kevlar Torso");
	}

	@Override
	public void buildRobotArms() {
		robot.setRobotArms("Plastic Arms");
	}

	@Override
	public void buildRobotLegs() {
		robot.setRobotLegs("Plastic Legs");
	}
	@Override
	public Robot getRobot() {
		return this.robot; 		
	} 
}
