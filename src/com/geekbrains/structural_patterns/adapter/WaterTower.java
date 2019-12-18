package com.geekbrains.structural_patterns.adapter;

public class WaterTower implements Building {
    private House house;

   public WaterTower (House house){
       this.house=house;
   }

    @Override
    public void create() {
        this.house.design();
        this.house.design();
        this.house.connect();
    }


}
