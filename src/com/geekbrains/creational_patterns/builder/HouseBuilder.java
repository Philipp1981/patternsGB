package com.geekbrains.creational_patterns.builder;

public abstract class HouseBuilder {

//    protected House house;
private static volatile House instance;
//
//    public House getHouse() {
//        return house;
//    }

//    public House house() {
//        return house;
//    }

    public HouseBuilder buildNewHouse() {
 //     house= new House();
        getHouse();
      return this;
    }

    public abstract HouseBuilder buildFloors();
    public abstract HouseBuilder takeLocation();
    public abstract HouseBuilder chooseCompany();



    public static House getHouse() {
        House localInstance = instance;
        if (localInstance == null) {
            synchronized (House.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new House();
                }
            }
        }
        return localInstance;
    }
}
