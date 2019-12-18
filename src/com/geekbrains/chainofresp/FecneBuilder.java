package com.geekbrains.chainofresp;

public class FecneBuilder extends Builder {
    public FecneBuilder() {
        super(HouseBuild.Steps.CREATE_FENCE);
    }

    @Override
    public void buildImpl() {
        System.out.println("Building fence");
    }
}
