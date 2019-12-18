package com.geekbrains.com.geekbrains.creational_patterns.factory;

public class PicOffice implements Office {
    @Override
    public String firm() {
        return "OOO Pic";
    }

    @Override
    public String title() {
        return "Taganka";
    }

    @Override
    public String address() {
        return "Marksistskaya, 33";
    }

    @Override
    public String toString() {
        return "Firm: OOO PIC; Office: Taganka; Address: Marksistskaya, 33";
    }
}
