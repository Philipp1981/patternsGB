package com.geekbrains.structural_patterns.proxy;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class PicHouseList implements HouseList {
    @Override
    public String[] getHouseTable() {
        ArrayList<String> list = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new FileReader(new File("/tmp/house_list.csv")));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                list.add(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list.toArray(new String[list.size()]);
    }

    @Override
    public String getHouseAddress(String houseId) {
        String[] houses = getHouseTable();
        for(int i = 0; i<houses.length; i++) {
            if(houses[i].startsWith(houseId+";")) return houses[i];
        }
        return "";
    }
}

