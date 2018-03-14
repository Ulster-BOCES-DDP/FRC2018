package org.usfirst.frc.team6463.robot.commands;

import org.usfirst.frc.team6463.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class TeleopClawBoxOut_Commands extends Command {
	
	public TeleopClawBoxOut_Commands() {
        requires(Robot.claw);
        setTimeout(2);
    }
	
	@Override
	protected void execute() {
		while(Robot.oi.getJoystick().getRawButton(1) == true) {
			Robot.claw.BoxOut();
		}
		Robot.claw.Stop();
	}
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return isTimedOut();
	}

	protected void end() {
		Robot.claw.Stop();
	}
	
	protected void interrupted() {
		end();
	}
}
