package com.company.fajok;



public abstract class AllatFaj extends Faj {
	
	private int ero;
	public AllatFaj(String nev, int ero){
		super(nev);
		this.ero=ero;
	}
	
	public int getEro(){
		return ero;
	}

}
