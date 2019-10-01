package frc.team7170.robot2020.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team7170.robot2020.Robot;


public class ManualFrontArm extends Command {
    public ManualFrontArm() {

        requires(Robot.FrontArmControl);
    }

    @Override
    protected void initialize() {

    }

    @Override
    protected void execute() {
        Robot.FrontArmControl.setArmPercent(
                Robot.oi.getLeftTrigger(),
                Robot.oi.getRightTrigger()
        );


    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void end() {

    }

    @Override
    protected void interrupted() {
        super.interrupted();
    }
}
