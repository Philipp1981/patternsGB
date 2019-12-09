package com.geekbrains.creational_patterns.builder;

public class CrostHouseBuilder extends HouseBuilder {

    @Override
    public HouseBuilder buildFloors() {
        getHouse().setFloorsCount(25);
        return this;
    }

    @Override
    public HouseBuilder takeLocation() {
        getHouse().setDistrictLocation("Tagansky");
        return this;
    }

    @Override
    public HouseBuilder chooseCompany() {
        getHouse().setCompanyDeveloper("Crost");
        return this;
    }
}
