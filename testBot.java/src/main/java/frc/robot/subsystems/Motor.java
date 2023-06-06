package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import frc.robot.Constants;

public class Motor extends SubsystemBase {
    private CANSparkMax motor1;


//constructor
    public Motor(){
        motor1= new CANSparkMax(Constants.motorID, MotorType.kBrushless);
    }


//methods

    public void setSpeed(double x){
        motor1.set(x);
    }




}
