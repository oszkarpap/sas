package com.company.evolution;

public class faj {

    private String nev;
    private int piros, zold, kek;

    public faj() {
        //explicit konstruktor hivas
        this("Anonimus faj", 0, 0, 0);
      //  nev = "anonimus faj";
      //  piros=kek=zold=0;
    }

    public faj(String nev) {
        //az üres konstruktor
        this();
        this.nev = nev;
    }

    public faj (String nev, int piros, int zold, int kek){
        this.nev = nev;
        this.piros = piros;
        this.zold = zold;
        this.kek = kek;

    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setRGB(int ujPiros, int ujZold, int ujKek) {
        piros = ujPiros;
        zold = ujZold;
        kek = ujKek;
    }

    public void getRGB(RGB rgb){
        rgb.r = this.piros;
        rgb.g = this.zold;
        rgb.b = this.kek;
    }


}
