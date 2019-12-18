package com.geekbrains.com.geekbrains.creational_patterns.factory;

public class Main {
    public static void main(String[] args)throws Exception  {


         Contract contract=Fabric.getFabricInstance().getContract("Crost");
         Office office=contract.getOffice(contract.company());

        System.out.println(contract.toString());
        System.out.println(office.toString());

       }

}
