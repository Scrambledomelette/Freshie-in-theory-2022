package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.AutoConstants;
import frc.robot.subsystems.DriveSubsystem;

public class ComplexAuto extends SequentialCommandGroup {

    public ComplexAuto(DriveSubsystem drive) {
        addCommands(
                // Drive forward the specified distance
                new DriveDistanceProfiled(
                        AutoConstants.kAutoDriveDistance, drive),

                // Drive backward the specified distance
                new DriveDistanceProfiled(
                        -AutoConstants.kAutoBackupDistance, drive));
    }
}
