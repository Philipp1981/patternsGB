package com.geekbrains.com.geekbrains.creational_patterns.factory;

public class CrostContract implements Contract {
    @Override
    public String company() {
        return "OOO Crost";
    }

    @Override
    public String clientName() {
        return "Petros S.";
    }

    @Override
    public Double price() {
        return 6000000.0;
    }

    @Override
    public Office getOffice(String title) {
        return new CrostOffice();
    }

    @Override
    public String toString() {
        return "Company: CROST; Client: Petrov S.; Price: 6 000 000 rub";
    }
}
