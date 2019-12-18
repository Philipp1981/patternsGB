package com.geekbrains.structural_patterns.proxy;

public class ShowHouses {
    private HouseList houseList = new PicHouseListProxy();

    public void printHouseTable() {
        String[] houseTable = houseList.getHouseTable();
        String[] temp;
        System.out.println("House ID\tAddress");
        for(int i = 0; i < houseTable.length; i++) {
            temp = houseTable[i].split(";");
            System.out.printf("%s\t%s\t\t\t%s\n", temp[0], temp[1]);
        }
    }
}
