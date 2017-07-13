package model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EnzimiUKrvi implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7413656655161673274L;
	
	private double amilaza;
	private double lipaza;
	private double ckMb;
	private double troponin;
	private double mioglobin;
	
	public EnzimiUKrvi(){
		
	}

	public EnzimiUKrvi(double amilaza, double lipaza, double ckMb, double troponin, double mioglobin) {
		super();
		this.amilaza = amilaza;
		this.lipaza = lipaza;
		this.ckMb = ckMb;
		this.troponin = troponin;
		this.mioglobin = mioglobin;
	}

	public double getAmilaza() {
		return amilaza;
	}

	public void setAmilaza(double amilaza) {
		this.amilaza = amilaza;
	}

	public double getLipaza() {
		return lipaza;
	}

	public void setLipaza(double lipaza) {
		this.lipaza = lipaza;
	}

	public double getCkMb() {
		return ckMb;
	}

	public void setCkMb(double ckMb) {
		this.ckMb = ckMb;
	}

	public double getTroponin() {
		return troponin;
	}

	public void setTroponin(double troponin) {
		this.troponin = troponin;
	}

	public double getMioglobin() {
		return mioglobin;
	}

	public void setMioglobin(double mioglobin) {
		this.mioglobin = mioglobin;
	}
	
	public String toString(){
		return "Enzimi u krvi: Amilaza:" + this.getAmilaza() + ", Lipaza:" + this.getLipaza() + ", CK-MB:" + this.getCkMb() + ", Troponin:" + this.getTroponin() + ", Mioglobin:" + this.getMioglobin();
	}

}
