package com.geekbrains.com.geekbrains.creational_patterns.factory;

public interface Contract {
    String company();
    String clientName();
    Double price();
    Office getOffice(String title);
}
