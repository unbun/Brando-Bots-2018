package org.firstinspires.ftc.teamcode;

/**
 * Created by Josh on 10/12/2017.
 */

import android.hardware.camera2.DngCreator;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * The purpose of the BB18Map class is to work together with a Robot class to add easy implementation across op-modes and auto.
 * Holds named concurrent to that of the robot controller.
 */
public class BB18Map {

    //Motors
    DcMotor leftFrontDrive;
    //DcMotor leftBackDrive;
    DcMotor rightFrontDrive;
    //DcMotor rightBackDrive;
    DcMotor intake;
    DigitalChannel intakeLimit;

    // Class Map
    HardwareMap hwMap;

    public BB18Map() {
        //Empty on purpose
    }

    public void init(HardwareMap hardwareMap) {
        this.hwMap = hardwareMap;
        intake = hwMap.get(DcMotor.class, "intake");
        intakeLimit  = hwMap.get(DigitalChannel.class ,"intakeLimit");
        // Motors
        leftFrontDrive = hwMap.get(DcMotor.class, "leftF");
        //leftBackDrive = hwMap.get(DcMotor.class, "leftB");
        rightFrontDrive = hwMap.get(DcMotor.class, "rightF");
        //rightBackDrive = hwMap.get(DcMotor.class, "rightB");
    }
}