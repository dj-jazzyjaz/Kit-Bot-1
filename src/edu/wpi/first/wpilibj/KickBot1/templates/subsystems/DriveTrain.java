package edu.wpi.first.wpilibj.KickBot1.templates.subsystems;

import edu.wpi.first.wpilibj.KickBot1.templates.RobotMap;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor; 
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
    
   // public Victor VictorFrontLeftMotor = new Victor(RobotMap.frontLeftMotor);
   // public Victor VictorFrontRightMotor = new Victor(RobotMap.frontRightMotor);
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public RobotDrive m_drive = new RobotDrive(RobotMap.frontLeftMotor, RobotMap.frontRightMotor);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	//RobotDrive.Method; with Method being Stop
    }
}

