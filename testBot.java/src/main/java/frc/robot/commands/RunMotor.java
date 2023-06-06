package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Motor;

public class RunMotor extends CommandBase {
    private Motor _motor;
    

    public RunMotor(Motor _motor){
        this._motor=_motor;
    }

    @Override
    public void initialize(){
    }

    @Override 
    public void execute(){
        _motor.setSpeed(.3);
    }

    @Override
    public void end(boolean interrupted) {
         }

    @Override
    public boolean isFinished() {
  
      return false;

      
    }
}
