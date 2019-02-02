package com.company.Autonyilvantarto.jarmu;

public abstract class Jarmu {

	private String rendszam;
	private final int id=nextID++;
	private static int nextID=0;
	public Jarmu(String rendszam){
		this.rendszam=rendszam.toUpperCase();
	}
	
	public String getRendszam() {
		return rendszam;
	}

	public void setRendszam(String rendszam) {
		this.rendszam = rendszam.toUpperCase();
	}

	public int getId() {
		return id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Jarmu){
			Jarmu jarmu=(Jarmu)obj;
			return rendszam.equals(jarmu.rendszam);
		}else return false;
	}
}
