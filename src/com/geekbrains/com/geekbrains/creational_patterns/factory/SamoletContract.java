package com.geekbrains.com.geekbrains.creational_patterns.factory;

public class SamoletContract implements Contract {
    @Override
    public String company() {
        return "OOO Samolet-Development";
    }

    @Override
    public String clientName() {
        return "Ivanov A.";
    }

    @Override
    public Double price() {
        return 5000000.0;
    }

    @Override
    public Office getOffice(String title) {
        return new SamoletOffice();
    }

    @Override
    public String toString() {
        return "Company: Samolet; Client: Ivanov A.; Price: 5 000 000 rub";
    }
}
