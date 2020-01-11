package frc.team7170.robot2020.subsystems;

import frc.team7170.robot2020.commands.EndEffector;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DoubleSolenoid;

public class Solnoid extends Subsystem {


    DoubleSolenoid pin1 = new DoubleSolenoid(6, 3, 1);


    public void set(Boolean position){

//        if (position == Boolean.TRUE){
//            pin1.set(DoubleSolenoid.Value.kForward);
//        }else{
//            pin1.set(DoubleSolenoid.Value.kReverse);
//        }

    }




    public void initDefaultCommand() {
        setDefaultCommand(new EndEffector());
    }
}

