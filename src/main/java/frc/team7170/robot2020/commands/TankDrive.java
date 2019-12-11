package frc.team7170.robot2020.commands;

import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj.command.Command;
import frc.team7170.robot2020.OI;
import frc.team7170.robot2020.Robot;


public class TankDrive extends Command {
    public TankDrive() {
        requires(Robot.drivebase);
    }


    protected void initialize() {

    }

    protected void execute() {
        Robot.drivebase.set(
                ControlMode.PercentOutput,
                Robot.oi.getLeftJoyY() * OI.DRIVE_THROTTLE,
                Robot.oi.getRightJoyY() * OI.DRIVE_THROTTLE
        );
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
