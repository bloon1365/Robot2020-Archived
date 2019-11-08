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

    //Motor Values

    //Drive Motors
    LEFT_MOTOR(12),
    LEFT_MOTOR_FOLLOWER(11),
    RIGHT_MOTOR(15),
    RIGHT_MOTOR_FOLLOWER(16),

    //Arm Motors
    LEFT_ARM_MOTOR(14),
    RIGHT_ARM_MOTOR(10),

    //Elevator Motors
    ELEVATOR_MOTOR_1(20),
    ELEVATOR_MOTOR_2(21),

    //Joystick values
    JOYSTICK(0),

    L_TRIGGER(2),
    R_TRIGGER(3),

    RIGHT_JOYSTICK_X(4),
    RIGHT_JOYSTICK_Y(5),
    LEFT_JOYSTICK_X(0),
    LEFT_JOYSTICK_Y(1),

    BUTTON_A(0),
    BUTTON_B(1),
    BUTTON_X(2),
    BUTTON_Y(3),
    BUTTON_LB(4),
    BUTTON_RB(5),
    BUTTON_BACK(6),
    BUTTON_START(7),
    JOYSTICK_BUTTON_L(8),
    JOYSTICK_BUTTON_R(9),

    ;

    public final int value;

    RobotMap(int value){
        this.value = value;
    }
}
