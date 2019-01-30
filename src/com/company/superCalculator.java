package com.company;

public class superCalculator extends calculator{

    private superCalculator(){}

    public static double square(int a, int b){

        if(a==0){
            return 0;
        }

        if(b==1){
            return 1;
        }
        double x=1;
        for (int i = 0; i < b; i++) {
            x*=a;
        }

        return x;
    }
}
