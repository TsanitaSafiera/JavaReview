package com.syntax.review2;

public class NestedIf {
    public static void main(String[] args) {

        /*
        declare 2 variables for DL and a car

        if you have DL i will check if you have a car

         */

        boolean driverLicence=false;
        boolean car=true;

        if(driverLicence){
            System.out.println("Let's check if you have a car");
            if(car){
                System.out.println("You can drive to work");
            }else{
                System.out.println("You will need to take a bus or uber");
            }
        }else{
            System.out.println("You should get a DL");
        }


    }
}
