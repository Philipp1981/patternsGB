package com.geekbrains.mediator;

public class PowerSupply {
    private Mediator mediator;
    private boolean isOn = false;
    private int power;

    public PowerSupply(Mediator mediator, boolean isOn, int power) {
        this.mediator = mediator;
        this.isOn = isOn;
        this.power=power;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void turnOn() {
        isOn=true;
        System.out.println("Power ON");
    }

    public void turnOff() {
        isOn=false;
        System.out.println("Power OFF");
    }
}


