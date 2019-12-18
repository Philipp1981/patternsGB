package com.geekbrains.observer;

import java.util.Observable;
import java.util.Observer;

public class TVChannel implements Observer {
    @Override
    public void update(Observable agency, Object tvNewsItem) {
        if(agency instanceof Publisher) {
            System.out.println((String) tvNewsItem);
        }
    }
}
