package com.company;


import java.util.*;

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

        TreeSet<Integer> hashMap = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            hashMap.add((int)(Math.random()*100));

        }

        robotJatekos robotJatekos = new robotJatekos();

        felhasznaloJatekos felhasznaloJatekos = new felhasznaloJatekos("Saci");
        felhasznaloJatekos.lep();

        asztal asztal01 = new asztal();

        robotJatekos.lep();
        robotJatekos.setMoney(20);
        System.out.println(robotJatekos.getMoney());


        System.out.println(hashMap);


        calculator.kivon(3,4);

        calculator calc = new calculator();

        System.out.println(calc.kivon(4,7));
        System.out.println(calc.osszead(5,5));
        System.out.println(calc.szorzas(4,3));
        System.out.println(calc.osztas(9,3));




        System.out.println(superCalculator.square(3,3));
        System.out.println(superCalculator.kivon(10,1));


        System.out.println(superCalculator.square(0,2));
        System.out.println(superCalculator.square(5,1));


    }
}
