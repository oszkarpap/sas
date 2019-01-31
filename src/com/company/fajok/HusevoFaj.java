package com.company.fajok;

import com.company.elolenyek.Eloleny;
import com.company.elolenyek.Husevo;
import com.company.evolucio.Evolucio;


public class HusevoFaj extends AllatFaj {

	public HusevoFaj(String nev, int ero) {
		super(nev, ero);
	}

	@Override
	public Eloleny ujEgyed() {
		return new Husevo(this, Evolucio.RAND.nextBoolean());
	}

}
