package com.company;

import java.util.ArrayList;

public class asztal {

    //dim list
    private ArrayList<jatekos> jatekosok;
    private int korok;
    private double pot;
    private double aktualisTet;

    public asztal(){
        korok=0;
        pot=0;
        aktualisTet=1.0;
        jatekosok= new ArrayList<>();
        jatekosok.add(new robotJatekos());
    }

}
