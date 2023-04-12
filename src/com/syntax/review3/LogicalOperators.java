package com.syntax.review3;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean loginButtonDisplay=true;
        boolean loginClickable=true;

        if (loginButtonDisplay && loginClickable){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }
    }
}
