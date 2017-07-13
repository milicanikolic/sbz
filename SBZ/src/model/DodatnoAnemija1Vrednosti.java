package model;

import java.io.Serializable;

import enums.Kolicina;

public class DodatnoAnemija1Vrednosti implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5364227094738076479L;

	private Kolicina tibc;
	private Kolicina uibc;
	private Kolicina gvozdje;
	
	
	public DodatnoAnemija1Vrednosti() {
		tibc=Kolicina.NA;
		uibc=Kolicina.NA;
		gvozdje=Kolicina.NA;
	}


	public Kolicina getTibc() {
		return tibc;
	}


	public void setTibc(Kolicina tibc) {
		this.tibc = tibc;
	}


	public Kolicina getUibc() {
		return uibc;
	}


	public void setUibc(Kolicina uibc) {
		this.uibc = uibc;
	}


	public Kolicina getGvozdje() {
		return gvozdje;
	}


	public void setGvozdje(Kolicina gvozdje) {
		this.gvozdje = gvozdje;
	}
	
	public String toString(){
		return "gvozdje je: "+this.getGvozdje()+" ,tibc: "+this.getTibc()+" ,uibc: "+this.getUibc();
	}
	
}
