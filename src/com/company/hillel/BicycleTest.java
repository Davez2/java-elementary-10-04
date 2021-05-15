package com.hillel;


public class BicycleTest {
    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle();
        bicycle.model = "Model X";
        bicycle.ride();

        Bicycle.Seat seat = bicycle.new Seat();
        seat.up();
        seat.down();
        Bicycle.SteeringWheel steeringWheel = bicycle.new SteeringWheel();
        steeringWheel.left();
        steeringWheel.right();


    }
}
