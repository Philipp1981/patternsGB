package com.geekbrains.observer;

public class Main {
    public static void main(String[] args){
        NewAgence newsAgency = new NewAgence();
        RadioChannel radioChannel = new RadioChannel();
        TVChannel tvChannel=new TVChannel();

        newsAgency.register(radioChannel);
        newsAgency.register(tvChannel);

        newsAgency.addNews("    ");
        newsAgency.addNews("      2018");
        newsAgency.addNews("   ");

        radioChannel.update(newsAgency, "wow");
        tvChannel.update(newsAgency, "wtf");
    }
}
