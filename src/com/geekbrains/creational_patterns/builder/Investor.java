package com.geekbrains.creational_patterns.builder;

public class Investor {

    private HouseBuilder houseBuilder;

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House getHouse() {
        return houseBuilder.getHouse();
    }

    public void makeHouse() {
        houseBuilder.buildNewHouse()
                .buildFloors()
                .takeLocation()
                .chooseCompany();
    }


}
