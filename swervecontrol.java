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

// Chassis Speeds (Şasi Hızları) kısmı

import edu.wpi.first.math.kinematics.ChassisSpeeds;

ChassisSpeeds speeds = new ChassisSpeeds(vx, vy, omega);
// vx: İleri/geri hız
// vy: Yanlara doğru hız
// omega: Açısal hız (dönüş)
