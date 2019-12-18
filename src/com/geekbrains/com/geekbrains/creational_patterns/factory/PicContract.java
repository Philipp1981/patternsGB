package com.geekbrains.com.geekbrains.creational_patterns.factory;

public class PicContract implements Contract {
    @Override
    public String company() {
        return "OOO Pic";
    }

    @Override
    public String clientName() {
        return "Sidorov N.";
    }

    @Override
    public Double price() {
        return 10000000.0;
    }

    @Override
    public Office getOffice(String title) {
        return new PicOffice();
    }

    @Override
    public String toString() {
        return "Company: PIC; Client: Sidorov N.; Price: 10 000 000 rub";
    }
}
