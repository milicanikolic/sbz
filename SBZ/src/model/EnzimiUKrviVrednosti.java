package model;

import java.io.Serializable;

import enums.Kolicina;

public class EnzimiUKrviVrednosti implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 861218308993016170L;
	
	private Kolicina amilaza;
	private Kolicina lipaza;
	private Kolicina ckMb;
	private Kolicina troponin;
	private Kolicina mioglobin;
	
	public EnzimiUKrviVrednosti() {
		amilaza=Kolicina.NA;
		lipaza=Kolicina.NA;
		ckMb=Kolicina.NA;
		troponin=Kolicina.NA;
		mioglobin=Kolicina.NA;
	}

	public Kolicina getAmilaza() {
		return amilaza;
	}

	public void setAmilaza(Kolicina amilaza) {
		this.amilaza = amilaza;
	}

	public Kolicina getLipaza() {
		return lipaza;
	}

	public void setLipaza(Kolicina lipaza) {
		this.lipaza = lipaza;
	}

	public Kolicina getCkMb() {
		return ckMb;
	}

	public void setCkMb(Kolicina ckMb) {
		this.ckMb = ckMb;
	}

	public Kolicina getTroponin() {
		return troponin;
	}

	public void setTroponin(Kolicina troponin) {
		this.troponin = troponin;
	}

	public Kolicina getMioglobin() {
		return mioglobin;
	}

	public void setMioglobin(Kolicina mioglobin) {
		this.mioglobin = mioglobin;
	}
	
	public String toString(){
		return "Enzimi u krvi: Amilaza:" + this.getAmilaza() + ", Lipaza:" + this.getLipaza() + ", CK-MB:" + this.getCkMb() + ", Troponin:" + this.getTroponin() + ", Mioglobin:" + this.getMioglobin();
	}

}
