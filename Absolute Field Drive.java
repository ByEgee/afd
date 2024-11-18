package frc.robot.commands.swervedrive.drivebase;

import edu.wpi.first.math.geometry.Translation2d;
import frc.robot.subsystems.swervedrive.SwerveSubsystem;

public class AbsoluteFieldDrive extends Command {
    private final SwerveSubsystem swerve;
    private final DoubleSupplier vX, vY, heading;

    public AbsoluteFieldDrive(SwerveSubsystem swerve, DoubleSupplier vX, DoubleSupplier vY, DoubleSupplier heading) {
        this.swerve = swerve;
        this.vX = vX;
        this.vY = vY;
        this.heading = heading;
    }

    @Override
    public void execute() {
        // Robot sahaya göre hareket eder.
        swerve.drive(vX.getAsDouble(), vY.getAsDouble(), heading.getAsDouble());
    }
}
