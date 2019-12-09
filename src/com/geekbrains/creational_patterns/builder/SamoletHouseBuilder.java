package com.geekbrains.creational_patterns.builder;

public class SamoletHouseBuilder extends HouseBuilder {

    @Override
    public HouseBuilder buildFloors() {
        getHouse().setFloorsCount(5);
        return this;
    }

    @Override
    public HouseBuilder takeLocation() {
        getHouse().setDistrictLocation("Biriulevo");
        return this;
    }

    @Override
    public HouseBuilder chooseCompany() {
        getHouse().setCompanyDeveloper("Samolet_Development");
        return this;
    }
}
