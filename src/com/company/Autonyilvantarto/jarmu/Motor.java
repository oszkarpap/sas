package com.company.Autonyilvantarto.jarmu;

public class Motor extends Jarmu {

	private boolean vanEKitamasztoja=true;
	
	public Motor(String rendszam) {
		super(rendszam);
	}

	public boolean isVanEKitamasztoja() {
		return vanEKitamasztoja;
	}

	public void setVanEKitamasztoja(boolean vanEKitamasztoja) {
		this.vanEKitamasztoja = vanEKitamasztoja;
	}

}
