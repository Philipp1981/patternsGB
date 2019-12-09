package com.geekbrains.creational_patterns.builder;

public class Main {

    public static void main(String[] args) {
        Investor investor=new Investor();
        HouseBuilder picHouseBuilder=new PicHouseBuilder();
        investor.setHouseBuilder(picHouseBuilder);
        investor.makeHouse();
        House house1=investor.getHouse();
        System.out.println(house1.toString());

    }
}
