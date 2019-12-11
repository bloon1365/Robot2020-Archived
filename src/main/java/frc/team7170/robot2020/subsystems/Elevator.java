package frc.team7170.robot2020.subsystems;

import com.revrobotics.CANSparkMax;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team7170.robot2020.RobotMap;
import frc.team7170.robot2020.commands.ManualElevator;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class Elevator extends Subsystem {

    private double power;

    private CANSparkMax motor1;
    private CANSparkMax motor2;

    public Elevator(){
        motor1 = new CANSparkMax(RobotMap.ELEVATOR_MOTOR_1.value, MotorType.kBrushed);
        motor2 = new CANSparkMax(RobotMap.ELEVATOR_MOTOR_2.value, MotorType.kBrushed);
    }


    public void setRaw(double left, double right){
        left = 0 - left;
        power = left + right;
        motor1.set(power);
        motor2.set(power);
    }


    public void initDefaultCommand() {setDefaultCommand(new ManualElevator());
    }
}

