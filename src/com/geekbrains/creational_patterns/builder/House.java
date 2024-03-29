package com.geekbrains.creational_patterns.builder;

public class House {

        private int floorsCount;
        private String districtLocation;
        private String companyDeveloper;

    public void setFloorsCount(int floorsCount) {
        this.floorsCount = floorsCount;
    }

    public void setDistrictLocation(String districtLocation) {
        this.districtLocation = districtLocation;
    }

    public void setCompanyDeveloper(String companyDeveloper) {
        this.companyDeveloper = companyDeveloper;
    }

    @Override
    public String toString() {
        return "House{" + "floorsCount=" + floorsCount + ", districtLocation='" + districtLocation + '\'' + ", companyDeveloper='" + companyDeveloper + '\'' + '}';
    }

}