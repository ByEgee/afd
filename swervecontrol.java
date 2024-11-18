package swervelib;

public class SwerveModule {
    private final MotorController driveMotor, steerMotor;

    public SwerveModule(MotorController driveMotor, MotorController steerMotor) {
        this.driveMotor = driveMotor;
        this.steerMotor = steerMotor;
    }

    public void set(double speed, double angle) {
        driveMotor.set(speed); // Hız kontrolü
        steerMotor.set(angle); // Dönüş açısı kontrolü
    }
}
