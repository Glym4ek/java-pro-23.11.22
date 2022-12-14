package com.gmail.woosay333.oop.introduction.car;

public class Car {

    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startFuelSystem() {
        System.out.println("Start fuel system!");
    }

    private void startCommand() {
        System.out.println("Start command");
    }

    private void startElectricity() {
        System.out.println("Start electricity");
    }
}
