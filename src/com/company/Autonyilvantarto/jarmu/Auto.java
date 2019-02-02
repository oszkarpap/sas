package com.company.Autonyilvantarto.jarmu;

public class Auto extends Jarmu {

	private int ajtokSzama=4;
	public Auto(String rendszam) {
		super(rendszam);
	}
	
	public int getAjtokSzama() {
		return ajtokSzama;
	}
	public void setAjtokSzama(int ajtokSzama) {
		this.ajtokSzama = ajtokSzama;
	}
	
	@Override
	public String toString() {
		return "Autó["+getId()+"]: "+getRendszam();
	}

}
