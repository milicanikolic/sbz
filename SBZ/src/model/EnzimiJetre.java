package model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EnzimiJetre implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8410696765037662720L;
	private double alt;
	 private double ast;
	 private double gamaGT;
	 private double alp;
	 
	 public EnzimiJetre(){
	  
	 }

	 public EnzimiJetre(double alt, double ast, double gamaGT, double alp) {
	  super();
	  this.alt = alt;
	  this.ast = ast;
	  this.gamaGT = gamaGT;
	  this.alp = alp;
	 }


	 public double getAst() {
	  return ast;
	 }

	 public void setAst(double ast) {
	  this.ast = ast;
	 }

	 public double getGamaGT() {
	  return gamaGT;
	 }

	 public void setGamaGT(double gamaGT) {
	  this.gamaGT = gamaGT;
	 }

	 public double getAlp() {
	  return alp;
	 }

	 public void setAlp(double alp) {
	  this.alp = alp;
	 }
	 
	 
	 
	 public double getAlt() {
		return alt;
	}

	public void setAlt(double alt) {
		this.alt = alt;
	}

	public String toString(){
	  return "Enzimi Jetre: ALT: " + this.getAlt() + " , AST: " + this.getAst() + ", " + "Gama GT: " + this.getGamaGT() + ", " + " ALP: " + this.getAlp();
	 }
	

}
