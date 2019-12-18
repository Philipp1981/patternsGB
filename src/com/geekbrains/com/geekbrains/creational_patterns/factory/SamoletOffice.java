package com.geekbrains.com.geekbrains.creational_patterns.factory;

public class SamoletOffice implements Office {
    @Override
    public String firm() {
        return "Samolet";
    }

    @Override
    public String title() {
        return "Novogireevo";
    }

    @Override
    public String address() {
        return "Novogireevskaya, 3";
    }

    @Override
    public String toString() {
        return "Firm: OOO Samolet; Office: Novogireevo; Address: Novogireevskaya, 3";
    }
}
