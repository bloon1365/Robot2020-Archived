/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.team7170.robot2020;

import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {


    public static final double JOY_DEADZONE = 0.05;
    public static final double DRIVE_THROTTLE = 0.5;


    public final Joystick JOYSTICK = new Joystick(RobotMap.JOYSTICK.value);

    public double getLeftTrigger() {
        return JOYSTICK.getRawAxis(2);
    }

    public double getRightTrigger() {
        return JOYSTICK.getRawAxis(3);
    }

    public double getLeftJoyX() {
        double raw = JOYSTICK.getRawAxis(RobotMap.LEFT_JOYSTICK_X.value);
        return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
    }

    public double getLeftJoyY() {
        double raw = JOYSTICK.getRawAxis(RobotMap.LEFT_JOYSTICK_Y.value);
        return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
    }

    public double getRightJoyX() {
        double raw = JOYSTICK.getRawAxis(RobotMap.RIGHT_JOYSTICK_X.value);
        return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
    }

    public double getRightJoyY() {
        double raw = JOYSTICK.getRawAxis(RobotMap.RIGHT_JOYSTICK_Y.value);
        return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
    }

    public OI(){

    }
}
