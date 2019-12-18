package com.geekbrains.mediator;

public class Fan {
    private Mediator mediator;
    private boolean isOn = false;

    public Fan(Mediator mediator, boolean isOn) {
        this.mediator = mediator;
        this.isOn = isOn;
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

    public void turnOn() {
 //       mediator.startPower();
        isOn = true;
        System.out.println("Fan is ON");
    }

    public void turnOff() {
        isOn = false;
//        mediator.stopPower();
        System.out.println("Fan is OFF");
    }
}
