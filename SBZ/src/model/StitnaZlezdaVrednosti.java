package model;

import java.io.Serializable;

import enums.Kolicina;

public class StitnaZlezdaVrednosti implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 995007171181334053L;
	
	
	private Kolicina t3;
	private Kolicina t4;
	private Kolicina tsh;
	
	
	public StitnaZlezdaVrednosti() {
		t3=Kolicina.NA;
		t4=Kolicina.NA;
		tsh=Kolicina.NA;
	}


	public Kolicina getT3() {
		return t3;
	}


	public void setT3(Kolicina t3) {
		this.t3 = t3;
	}


	public Kolicina getT4() {
		return t4;
	}


	public void setT4(Kolicina t4) {
		this.t4 = t4;
	}


	public Kolicina getTsh() {
		return tsh;
	}


	public void setTsh(Kolicina tsh) {
		this.tsh = tsh;
	}
	
	public String toString(){
		
		return "Vrednosti stitne zlezde: T3: "+this.getT3()+" ,T4: "+this.getT4()+" ,TSH: "+this.getTsh();
	}

}
