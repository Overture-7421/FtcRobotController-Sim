package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import org.overture.ftc.OverDcMotor;

@Autonomous(name = "Auto", group = "Test")
public class TestOpMode extends LinearOpMode {
    @Override
    public void runOpMode() {
        OverDcMotor dcMotor = new OverDcMotor(hardwareMap, "ChassisRightMotor");

        waitForStart();

        System.out.println("Waiting 6 seconds...");
        dcMotor.setPower(-0.25);
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        dcMotor.setPower(0.25);
        System.out.println("Done");
    }
}