package com.company.evolution;

public class Evolutcio {

    public static void main(String[] args) {

        faj f1 = new faj();
        f1.setNev("Tigris");

        faj f2 = new faj();
        f2.setNev("Elefant");

        faj f3 = new faj("Teve", 100, 100, 100);

        faj f4 = new faj();

        System.out.println(f1.getNev());
        System.out.println(f2.getNev());
        System.out.println(f3.getNev());
        System.out.println(f4.getNev());

        RGB rgb = new RGB();
        f3.getRGB(rgb);


        System.out.println(rgb.r+" "+rgb.g+" "+rgb.b);

        f1.setNev("Sas");

    }




}
