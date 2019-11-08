package frc.team7170.robot2020.commands;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Command;
import frc.team7170.robot2020.Robot;
import frc.team7170.robot2020.RobotMap;


public class ManualElevator extends Command {

    public ManualElevator(){
    requires(Robot.Elevator);
    }

    @Override
    protected void execute() {
        Robot.Elevator.setRaw(Robot.oi.getLeftTrigger(), Robot.oi.getRightTrigger());
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
