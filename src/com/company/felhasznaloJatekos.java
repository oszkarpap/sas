package com.company;

public class felhasznaloJatekos extends jatekos {

    private String nev;

    public felhasznaloJatekos (String felhNev){
        nev = felhNev;
    }



    @Override
    public void lep() {
        System.out.println(getNev()+": lepek");
    }


    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getNev() {
        return nev;
    }
}
