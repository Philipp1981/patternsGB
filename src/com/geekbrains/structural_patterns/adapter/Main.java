package com.geekbrains.structural_patterns.adapter;

public class Main {

    public static void main(String[] args) {

        Building waterTower=new WaterTower(new House());
        waterTower.create();
//        System.out.println(waterTower.toString());
    }
}
