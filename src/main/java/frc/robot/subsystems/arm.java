// RobotBuilder Version: 5.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

// ROBOTBUILDER TYPE: Subsystem.

package frc.robot.subsystems;


import frc.robot.commands.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator.Validity;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class arm extends SubsystemBase {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
private Compressor compressorArm;
private DoubleSolenoid leftDoubleSolenoid;
private DoubleSolenoid rightDoubleSolenoid;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    /**
    *
    */
    public arm() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
compressorArm = new Compressor(1, PneumaticsModuleType.CTREPCM);
 addChild("Compressor Arm",compressorArm);
 

leftDoubleSolenoid = new DoubleSolenoid(1, PneumaticsModuleType.CTREPCM, 0, 1);
 addChild("Left Double Solenoid", leftDoubleSolenoid);
 
rightDoubleSolenoid = new DoubleSolenoid(1, PneumaticsModuleType.CTREPCM, 2, 3);
addChild("Right Double Solenoid", rightDoubleSolenoid);

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    public void Extend(){
        leftDoubleSolenoid.set(Value.kForward);
    }

    public void Retract(){
        leftDoubleSolenoid.set(Value.kReverse);
    }

    public void Push() {
        rightDoubleSolenoid.set(Value.kForward);
    }

    public void Pull() {
        rightDoubleSolenoid.set(Value.kReverse);
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run

    }

    @Override
    public void simulationPeriodic() {
        // This method will be called once per scheduler run when in simulation

    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

}

