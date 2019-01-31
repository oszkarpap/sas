package com.company.fajok;

import com.company.elolenyek.Eloleny;
import com.company.elolenyek.Noveny;

public class NovenyFaj extends Faj {

	public NovenyFaj(String nev) {
		super(nev);
	}

	@Override
	public Eloleny ujEgyed() {
		return new Noveny(this);
	}

}
