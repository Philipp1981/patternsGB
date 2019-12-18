package com.geekbrains.chainofresp;

public class RoofBuilder extends Builder {
    public RoofBuilder() {
        super(HouseBuild.Steps.CREATE_ROOF);
    }

    @Override
    public void buildImpl() {
        System.out.println("Building roof");
    }
}
