package com.syntax.review2;

import java.util.SortedMap;

public class IfStatement {
    public static void main(String[] args) {

        int age=18;

        if(age>=18) {
            System.out.println("You can get a driver licence");
        }else{
            System.out.println("You are too young to drive");

            String expected="Best sellers";

            if(expected.equals("Best Seller")){
                System.out.println("test Passes");
            }else{
                System.out.println("Test Failed");
            }
        }

        }
}
