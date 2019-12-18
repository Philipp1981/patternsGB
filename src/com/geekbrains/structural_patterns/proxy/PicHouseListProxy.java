package com.geekbrains.structural_patterns.proxy;

public class PicHouseListProxy implements HouseList{
    private HouseList houseList=new PicHouseList();
    private String[] houseListCache;

    @Override
    public String[] getHouseTable() {
        if(houseListCache == null) {
            houseListCache = houseList.getHouseTable();
        }
        return houseListCache;
    }

    @Override
    public String getHouseAddress(String houseId) {
        if(houseListCache == null) {
            houseListCache = houseList.getHouseTable();
        }
        for(int i = 0; i < houseListCache.length; i++) {
            if(houseListCache[i].startsWith(houseId+";")) return houseListCache[i];
        }
        return "";
    }

    public void clearCache() {
        houseList = null;
    }
}