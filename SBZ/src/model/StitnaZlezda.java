package model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class StitnaZlezda implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7954990545067612800L;
	
	private double t3;
	private double t4;
	private double tsh;
	
	public StitnaZlezda(){
		
	}

	public StitnaZlezda(double t3, double t4, double tsh) {
		super();
		this.t3 = t3;
		this.t4 = t4;
		this.tsh = tsh;
	}

	public double getT3() {
		return t3;
	}

	public void setT3(double t3) {
		this.t3 = t3;
	}

	public double getT4() {
		return t4;
	}

	public void setT4(double t4) {
		this.t4 = t4;
	}

	public double getTsh() {
		return tsh;
	}

	public void setTsh(double tsh) {
		this.tsh = tsh;
	}
	
	

	
}
