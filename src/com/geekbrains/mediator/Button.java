package com.geekbrains.mediator;

public class Button {
    private Mediator mediator;
    private Fan fan;
    private PowerSupply powerSupply;

    public Button(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }


    public void turnOnFan(Fan fan) {
        fan.turnOn();
        System.out.println("Fan is ON");
    }

    public void turnOffFan(Fan fan) {
        fan.turnOff();
        System.out.println("Fan is OFF");
    }

    public void turnOnPower(PowerSupply powerSupply) {
        powerSupply.turnOn();
        System.out.println("Power is ON");
    }

    public void turnOffPower(PowerSupply powerSupply) {
        powerSupply.turnOff();
        System.out.println("Power is OFF");
    }


}
