package com.epam.lab.builder;
public class TestRobotBuilder implements Command {
@Override
	public void execute(){
		RobotBuilder oldStyleRobot = new OldRobotBuilder();
		RobotEngineer robotEngineer = new RobotEngineer(oldStyleRobot);
		robotEngineer.makeRobot(); 
		Robot firstRobot = robotEngineer.getRobot();
		System.out.println("Robot Built");
		System.out.println("Head  Type: " + firstRobot.getRobotHead());
		System.out.println("Torso Type: " + firstRobot.getRobotTorso());
		System.out.println("Arms  Type: " + firstRobot.getRobotArms());
		System.out.println("Legs  Type: " + firstRobot.getRobotLegs());
		
		RobotBuilder newStyleRobot = new NewRobotBuilder(); 
		RobotEngineer newRobotEngineer = new RobotEngineer(newStyleRobot);
		newRobotEngineer.makeRobot(); 
		Robot secondRobot = newRobotEngineer.getRobot();
		System.out.println("New Robot Built");
		System.out.println("Head  Type: " + secondRobot.getRobotHead());
		System.out.println("Torso Type: " + secondRobot.getRobotTorso());
		System.out.println("Arms  Type: " + secondRobot.getRobotArms());
		System.out.println("Legs  Type: " + secondRobot.getRobotLegs());
	}	
}
