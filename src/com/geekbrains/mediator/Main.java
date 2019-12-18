package com.geekbrains.mediator;

public class Main {

    public static void main(String[] args) {
        Mediator mediator=new Mediator();

        Button btn= new Button(mediator);
        Fan fn=new Fan(mediator, false);
        PowerSupply pws=new PowerSupply(mediator, false, 500);

        mediator.startFan(fn);
        mediator.stopFan(fn);
        mediator.startPower(pws);
        mediator.stopPower(pws);
//        mediator.pressFanButton(btn);
//        mediator.pressPowerButton(btn);

    }
}
