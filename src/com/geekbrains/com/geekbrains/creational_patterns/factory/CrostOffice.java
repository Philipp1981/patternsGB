package com.geekbrains.com.geekbrains.creational_patterns.factory;

public class CrostOffice implements Office {
    @Override
    public String firm() {
        return "Crost";
    }

    @Override
    public String title() {
        return "Bibirevo";
    }

    @Override
    public String address() {
        return "Bibirevskaya, 10";
    }

    @Override
    public String toString() {
        return "Firm: OOO CROST; Office: Bibirevo; Address: Bibirevskaya, 10";
    }
}
