package com.company.elolenyek;

import com.company.fajok.NovenyFaj;

public class Noveny extends Eloleny {

	public Noveny(NovenyFaj faj) {
		super(faj);
	}

	@Override
	public void elelmetKeres(Eloleny[] elolenyek) {
		return;
	}
	
	@Override
	public boolean eheto(Eloleny eloleny) {
		return true;
	}

}
