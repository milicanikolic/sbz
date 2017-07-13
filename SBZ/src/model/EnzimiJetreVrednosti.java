package model;

import java.io.Serializable;

import enums.Kolicina;

public class EnzimiJetreVrednosti implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1738309614915036367L;
	
	private Kolicina alt;
	 private Kolicina ast;
	 private Kolicina gamaGT;
	 private Kolicina alp;
	 
	 public EnzimiJetreVrednosti() {
		 alt=Kolicina.NA;
		 ast=Kolicina.NA;
		 gamaGT=Kolicina.NA;
		 alp=Kolicina.NA;
	 }



	public Kolicina getAlt() {
		return alt;
	}



	public void setAlt(Kolicina alt) {
		this.alt = alt;
	}



	public Kolicina getAst() {
		return ast;
	}

	public void setAst(Kolicina ast) {
		this.ast = ast;
	}

	public Kolicina getGamaGT() {
		return gamaGT;
	}

	public void setGamaGT(Kolicina gamaGT) {
		this.gamaGT = gamaGT;
	}

	public Kolicina getAlp() {
		return alp;
	}

	public void setAlp(Kolicina alp) {
		this.alp = alp;
	}
	 public String toString(){
		  return "Enzimi Jetre: ALT: " + this.getAlt() + " , AST: " + this.getAst() + ", " + "Gama GT: " + this.getGamaGT() + ", " + " ALP: " + this.getAlp();
		 }
	 

}
