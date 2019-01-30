package com.company;


import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Vector<Integer> vector = new Vector<>(10);
        for (int i = 0; i < vector.capacity(); i++) {
            vector.add((int) (Math.random()*100));
        }
        System.out.println(vector);
        Collections.sort(vector);
        System.out.println(vector);

        Collections.shuffle(vector);
        System.out.println(vector);

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            hashMap.put(i,(int)(Math.random()*100));

        }

        System.out.println(hashMap);


        calculator calc = new calculator();

        System.out.println(calc.kivon(4,7));
        System.out.println(calc.osszead(5,5));
        System.out.println(calc.szorzas(4,3));
        System.out.println(calc.osztas(9,3));
    }
}
