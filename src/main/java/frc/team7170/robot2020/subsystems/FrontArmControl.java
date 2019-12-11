package frc.team7170.robot2020.subsystems;


import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team7170.robot2020.Robot;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import frc.team7170.robot2020.RobotMap;
import frc.team7170.robot2020.commands.ManualFrontArm;

public class FrontArmControl extends Subsystem {

    private TalonSRX leftArmMotor;
    private TalonSRX rightArmMotor;

    private double power;

    public FrontArmControl(){
        leftArmMotor = new TalonSRX(RobotMap.LEFT_ARM_MOTOR.value);
        rightArmMotor = new TalonSRX(RobotMap.RIGHT_ARM_MOTOR.value);

        Robot.initTalon(leftArmMotor);
        Robot.initTalon(rightArmMotor);

        rightArmMotor.follow(leftArmMotor);
    }

    public void setArmPercent(boolean left, boolean right){
        if (left) { power = 10; }
        else if (right) { power = -10; }
        else { power = 0; }
        leftArmMotor.set(ControlMode.PercentOutput, power);
    }

    protected void initDefaultCommand() { setDefaultCommand(new ManualFrontArm()); }
}

