package org.usfirst.frc.team6463.robot.subsystems;

import org.usfirst.frc.team6463.robot.RobotMap;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Claw_Subsystem extends Subsystem {

	private VictorSP ClawL = new VictorSP(RobotMap.CLAW_LEFT);
	private VictorSP ClawR = new VictorSP (RobotMap.CLAW_RIGHT);
	
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
