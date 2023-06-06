package frc.robot;

import frc.robot.subsystems.Motor;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.RunMotor;

public class RobotContainer {
    public final Motor _motor= new Motor();
    private static XboxController controller = new XboxController(2);


    public RobotContainer(){
        configureButtonBindings();
    }

    private void configureButtonBindings() {

        new JoystickButton(controller, XboxController.Button.kY.value).whileTrue(new RunMotor(_motor));
    }
}
