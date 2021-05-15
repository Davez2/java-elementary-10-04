package com.hillel;


public class Bicycle {
    String model;

    public void ride() {
        System.out.println("ride bicycle " + model);

    }

    public class SteeringWheel {
        public void left() {
            System.out.println("turn to the left " + model);
        }
        public void right() {
            System.out.println("turn to the right " +model);
        }
    }
    public class Seat {
        public void up() {
          System.out.println("seat up");
        }
        public void down(){
            System.out.println("seat down");
        }
    }
}
