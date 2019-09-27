package frc.team7170.robot2020.commands;

import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj.command.Command;
import frc.team7170.robot2020.Robot;


public class TankDrive extends Command {
    public TankDrive() {
        requires(Robot.drivebase);
    }


    protected void initialize() {

    }

    @Override
    protected void execute() {
        Robot.drivebase.set(ControlMode.PercentOutput, Robot.oi.getLeftJoyY(), Robot.oi.getRighttJoyY());
    }

    @Override
    protected boolean isFinished() {
        return false;
    }


    @Override
    protected void interrupted() {
        super.interrupted();
    }
}
