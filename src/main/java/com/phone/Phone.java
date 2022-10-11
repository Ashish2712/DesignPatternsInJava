package com.phone;

public class Phone {

    private String os;
    private int ram;
    private String processor;
    private double screenSize;
    private int battery;

    public Phone(String os, int ram, String processor, double screenSize, int battery){
        this.os = os;
        this.ram = ram;
        this.processor = processor;
        this.screenSize = screenSize;
        this.battery = battery;

        System.out.println("OS: "+this.os+ "\nRAM: "+this.ram+"\nPrcoessor: "+this.processor+"\nScreenSize: "+this.screenSize+"\nBattery: "+this.battery);
    }


}
