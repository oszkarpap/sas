package com.company.elolenyek;

import com.company.fajok.AllatFaj;
import com.company.fajok.Faj;

public class Husevo extends Allat {
	
	public Husevo(Faj faj, boolean nosteny) {
		super(faj, nosteny);
	}

	@Override
	public boolean eheto(Eloleny masikEloleny) {
		if(masikEloleny instanceof Allat){
			Allat allat=(Allat)masikEloleny;
			return ((AllatFaj)getFaj()).getEro()>((AllatFaj)allat.getFaj()).getEro();
		}else return false;
	}
	
	
	public static void elrejtozik(){
		System.out.println("Húsevő elrejtőzőtt!");
	}

}
