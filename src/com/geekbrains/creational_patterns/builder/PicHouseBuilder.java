package com.geekbrains.creational_patterns.builder;

public class PicHouseBuilder extends HouseBuilder {

    @Override
    public HouseBuilder buildFloors() {
        getHouse().setFloorsCount(17);
        return this;
    }

    @Override
    public HouseBuilder takeLocation() {
        getHouse().setDistrictLocation("Presnya");
        return this;
    }

    @Override
    public HouseBuilder chooseCompany() {
        getHouse().setCompanyDeveloper("PIC");
        return this;
    }
}
