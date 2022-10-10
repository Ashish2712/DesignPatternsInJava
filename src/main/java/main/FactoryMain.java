package main;

import phone.Android;
//import com.phone.OS;
import phone.OS;
import phone.OperatingSystemFactory;
import phone.Windows;

public class FactoryMain {

    public static void main(String[] args) {

        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS obj = osf.getInstance("");
         obj.spec();


    }
}
