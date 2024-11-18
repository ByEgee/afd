package frc.robot.subsystems;

import edu.wpi.first.math.geometry.Rotation2d;

public class SwerveSubsystem {
    private boolean fieldRelative = true;

    public void toggleFieldRelative() {
        fieldRelative = !fieldRelative;
    }

    public void drive(double vx, double vy, double omega) {
        if (fieldRelative) {
            // Alan odaklı sürüş
            driveFieldRelative(vx, vy, omega);
        } else {
            // Robot odaklı sürüş
            driveRobotRelative(vx, vy, omega);
        }
    }

    private void driveFieldRelative(double vx, double vy, double omega) {
        // Alan referanslı hız dönüşümü
    }

    private void driveRobotRelative(double vx, double vy, double omega) {
        // Doğrudan kontrol
    }
}
