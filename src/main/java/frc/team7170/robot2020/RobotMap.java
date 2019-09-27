/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.team7170.robot2020;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public enum RobotMap {

    LEFT_MOTOR(0),
    LEFT_MOTOR_FOLLOWER(3),
    RIGHT_MOTOR(1),
    RIGHT_MOTOR_FOLLOWER(4),

    LEFT_JOYSTICK(1),
    RIGHT_JOYSTICK(2);

    public final int value;

    RobotMap(int value){
        this.value = value;
    }
}
