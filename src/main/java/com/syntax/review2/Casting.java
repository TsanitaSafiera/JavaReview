package com.syntax.review2;

public class Casting {
    public static void main(String[] args) {

        //widening => from smaller data type to bigger
        //byte-> short->int->long->float->double
        double d=19;
        System.out.println(d); //19.0

        //narrowing => from bigger data type to smaller data type
        //Java says keep the change because it will just round it up
        // double-> float->long->int->short->byte
        int i=(int)19.0;
        System.out.println(i); //19
    }
}
