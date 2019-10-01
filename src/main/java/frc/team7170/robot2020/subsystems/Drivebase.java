package frc.team7170.robot2020.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team7170.robot2020.RobotMap;
import frc.team7170.robot2020.Robot;
import frc.team7170.robot2020.commands.TankDrive;

public class Drivebase extends Subsystem {

    private TalonSRX leftMotor;
    private TalonSRX leftMotorfollower;
    private TalonSRX rightMotor;
    private TalonSRX rightMotorfollower;

    public Drivebase(){
        leftMotor = new TalonSRX(RobotMap.LEFT_MOTOR.value);
        rightMotor = new TalonSRX(RobotMap.RIGHT_MOTOR.value);
        leftMotorfollower = new TalonSRX(RobotMap.LEFT_MOTOR_FOLLOWER.value);
        rightMotorfollower = new TalonSRX(RobotMap.RIGHT_MOTOR_FOLLOWER.value);

        Robot.initTalon(leftMotor);
        Robot.initTalon(rightMotor);
        Robot.initTalon(leftMotorfollower);
        Robot.initTalon(rightMotorfollower);

        leftMotorfollower.follow(leftMotor);
        rightMotorfollower.follow(rightMotor);
    }

    public void set(ControlMode mode, double leftvalue, double rightvalue){
        leftMotor.set(mode, leftvalue);
        rightMotor.set(mode, rightvalue);
    }

    protected void initDefaultCommand(){
        setDefaultCommand(new TankDrive());
    }
}

