package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        double firstDouble = 20.00;
        double secondDouble = 80.00;
        double result = (firstDouble + secondDouble)*100.00;
        System.out.println("result is " + result);
        double remain = result % 40.0;
        System.out.println("remain is " + remain);
        boolean bool = remain == 0.0 ? true : false;
        System.out.println("the bool is "+ bool);
        if(!bool){
            System.out.println("got some remainder");
        }

    }
}