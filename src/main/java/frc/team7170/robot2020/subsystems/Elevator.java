package frc.team7170.robot2020.subsystems;


import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team7170.robot2020.RobotMap;
import frc.team7170.robot2020.commands.ManualElevator;

public class Elevator extends Subsystem {

    private double power;

    private Spark motor1;
    private Spark motor2;

    public Elevator(){
        motor1 = new Spark(RobotMap.ELEVATOR_MOTOR_1.value);
        motor2 = new Spark(RobotMap.ELEVATOR_MOTOR_2.value);
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

