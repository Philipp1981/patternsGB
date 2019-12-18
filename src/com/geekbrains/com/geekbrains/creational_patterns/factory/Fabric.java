package com.geekbrains.com.geekbrains.creational_patterns.factory;

public class Fabric {
    private static volatile Fabric fabricInstance;
    public static final String PIC = "Pic";
    public static final String CROST = "Crost";
    public static final String SAMOLET="Samolet";


    public Office getOffice(String name) throws Exception {
        switch (name) {
            case PIC:
                return new PicOffice();
            case CROST:
                return new CrostOffice();
            case SAMOLET:
                return new SamoletOffice();
        }
        return null;
    }

    public Contract getContract(String name) throws Exception {
        switch (name) {
            case PIC:
                return new PicContract();
            case CROST:
                return new CrostContract();
            case SAMOLET:
                return new SamoletContract();
        }
        return null;
    }

    public static Fabric getFabricInstance() {
        Fabric localFabricInstance = fabricInstance;
        if (localFabricInstance == null) {
            synchronized (Fabric.class) {
               localFabricInstance=fabricInstance;
                if (localFabricInstance == null) {
                    fabricInstance = localFabricInstance = new Fabric();
                }
            }
        }
        return localFabricInstance;
    }
}