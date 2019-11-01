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

    LEFT_MOTOR(11),
    LEFT_MOTOR_FOLLOWER(12),
    RIGHT_MOTOR(15),
    RIGHT_MOTOR_FOLLOWER(16),

    JOYSTICK(0),

    L_TRIGGER(2),
    R_TRIGGER(3),

    RIGHT_JOYSTICK_X(4),
    RIGHT_JOYSTICK_Y(5),
    LEFT_JOYSTICK_X(0),
    LEFT_JOYSTICK_Y(1),

    LEFT_ARM_MOTOR(14),
    RIGHT_ARM_MOTOR(10),
    ;

    public final int value;

    RobotMap(int value){
        this.value = value;
    }
}
