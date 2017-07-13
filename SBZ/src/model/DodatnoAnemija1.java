package model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

//SIDEROPENIJSKA ANEMIJA

@XmlRootElement
public class DodatnoAnemija1 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -910963340156989734L;
	
	private double tibc;
	private double uibc;
	private double gvozdje;
	
	public DodatnoAnemija1(){
		
	}

	public DodatnoAnemija1(double tibc, double uibc, double gvozdje) {
		super();
		this.tibc = tibc;
		this.uibc = uibc;
		this.gvozdje = gvozdje;
	}

	public double getTibc() {
		return tibc;
	}

	public void setTibc(double tibc) {
		this.tibc = tibc;
	}

	public double getUibc() {
		return uibc;
	}

	public void setUibc(double uibc) {
		this.uibc = uibc;
	}

	public double getGvozdje() {
		return gvozdje;
	}

	public void setGvozdje(double gvozdje) {
		this.gvozdje = gvozdje;
	}
	
	

}
