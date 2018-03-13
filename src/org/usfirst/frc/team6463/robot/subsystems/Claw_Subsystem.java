package org.usfirst.frc.team6463.robot.subsystems;

import org.usfirst.frc.team6463.robot.RobotMap;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Claw_Subsystem extends Subsystem {

	private Victor ClawL = new Victor(RobotMap.CLAW_LEFT);
	private Victor ClawR = new Victor(RobotMap.CLAW_RIGHT);
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	
	public void BoxIn() {
		ClawL.set(1);
		ClawR.set(-1);
	}
	
	public void BoxOut() {
		ClawL.set(-1);
		ClawR.set(1);
	}
	
	public void Stop() {
		ClawL.set(0);
		ClawR.set(0);
	}

}
