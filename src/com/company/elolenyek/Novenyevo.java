package com.company.elolenyek;

import com.company.fajok.Faj;

public class Novenyevo extends Allat {

	public Novenyevo(Faj faj, boolean nosteny) {
		super(faj, nosteny);
	}

	@Override
	public boolean eheto(Eloleny masikEloleny) {
		return masikEloleny instanceof Noveny;
	}

}
