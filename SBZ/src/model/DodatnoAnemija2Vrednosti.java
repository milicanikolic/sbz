package model;

import java.io.Serializable;

import enums.Kolicina;

public class DodatnoAnemija2Vrednosti implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8242865609429494448L;

	private Kolicina b12;
	private Kolicina folnaKiselina;
	
	public DodatnoAnemija2Vrednosti() {
		b12=Kolicina.NA;
		folnaKiselina=Kolicina.NA;
	}

	public Kolicina getB12() {
		return b12;
	}

	public void setB12(Kolicina b12) {
		this.b12 = b12;
	}

	public Kolicina getFolnaKiselina() {
		return folnaKiselina;
	}

	public void setFolnaKiselina(Kolicina folnaKiselina) {
		this.folnaKiselina = folnaKiselina;
	}
	
	public String toString(){
		return "b12 je: "+this.getB12()+" ,folna kiselina: "+this.getFolnaKiselina();
	}
	
}
