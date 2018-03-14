package org.usfirst.frc.team6463.robot.commands;

import org.usfirst.frc.team6463.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class TeleopArmLower_Commands extends Command {
	public TeleopArmLower_Commands() {
        requires(Robot.arm);
        setTimeout(5);
    }
	
	@Override
	protected void execute() {
		while(Robot.oi.getJoystick().getRawButton(4) == true) {
			Robot.arm.RaiseArm();
		}
		Robot.arm.Stop();
	}
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	protected void end() {
		Robot.arm.Stop();
	}
	
	protected void interrupted() {
		end();
	}
}