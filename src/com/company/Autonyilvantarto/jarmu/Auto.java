package com.company.Autonyilvantarto.jarmu;

import java.util.Comparator;
import java.util.Objects;
import java.util.Random;

public class Auto extends Jarmu implements Comparable<Auto> {

	static public class AjtoOsszehasonlitas implements Comparator<Auto>{

		@Override
		public int compare(Auto a1, Auto a2) {

			//a1 kisebb a2-nél -1 ...

			int result = a1.ajtokSzama-a2.ajtokSzama;

			if(result==0){
				return a1.compareTo(a2);
			}else return result;
		}
	}

	public static final AjtoOsszehasonlitas AJTO_COMPARATOR  = new AjtoOsszehasonlitas();
	public static final Random RAND = new Random();
	private int ajtokSzama = RAND.nextInt(5);


	//private int ajtokSzama=4;
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
		return "Autó["+getId()+"]: "+getRendszam()+ " "+ajtokSzama;
	}

   // @Override
   // public int hashCode() {
   //     return getRendszam().hashCode();
   // }


	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Auto)) return false;
		if (!super.equals(o)) return false;
		Auto auto = (Auto) o;
		return getAjtokSzama() == auto.getAjtokSzama();
	}

	@Override
	public int compareTo(Auto auto) {
		//-1 ha this kisebb autonál
		// 0 azonosak

		return getRendszam().compareTo(auto.getRendszam());
	}
}
