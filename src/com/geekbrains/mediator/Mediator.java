package com.geekbrains.mediator;

public class Mediator {
    private Button button;
    private Fan fan;
    private PowerSupply powerSupply;

    public Mediator(){}

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }

    public Fan getFan() {
        return fan;
    }

    public void setFan(Fan fan) {
        this.fan = fan;
    }

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    public void startFan(Fan fan) {
        fan.turnOn();
    }

    public void stopFan(Fan fan) {
            fan.turnOff();
    }

    public void pressFanButton(Button button){button.turnOnFan(fan);}
    public void pressPowerButton(Button button){button.turnOnPower(powerSupply);}

    public void startPower(PowerSupply powerSupply) {
        powerSupply.turnOn();
    }

    public void stopPower(PowerSupply powerSupply) {
        powerSupply.turnOff();
    }
}
