package com.vytrack.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp(){
        System.out.println("\tThis is coming from BEFORE");
    }

    @After
    public void tearDown(){
        System.out.println("\tThat is comin from AFTER");
    }

    @Before ("@db")
    public void setUpDB(){
        System.out.println("\tConnecting to DateBase...");
    }

    @After ("@db")
    public void closeDB(){
        System.out.println("\tDisconnecting From DataBase...");
    }

}
