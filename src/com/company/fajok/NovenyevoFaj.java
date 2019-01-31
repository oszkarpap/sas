package com.company.fajok;

import com.company.elolenyek.Eloleny;
import com.company.elolenyek.Novenyevo;
import com.company.evolucio.Evolucio;

public class NovenyevoFaj extends AllatFaj {

	public NovenyevoFaj(String nev, int ero) {
		super(nev, ero);
	}

	@Override
	public Eloleny ujEgyed() {
		return new Novenyevo(this, Evolucio.RAND.nextBoolean());
	}

}
