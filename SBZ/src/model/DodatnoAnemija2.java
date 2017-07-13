package model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

//MEGALOBLASTNA ANEMIJA
@XmlRootElement
public class DodatnoAnemija2 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1724993245705050549L;
	
	private double b12;
	private double folnaKiselina;
	
	public DodatnoAnemija2(){
		
	}

	public DodatnoAnemija2(double b12, double folnaKiselina) {
		super();
		this.b12 = b12;
		this.folnaKiselina = folnaKiselina;
	}

	public double getB12() {
		return b12;
	}

	public void setB12(double b12) {
		this.b12 = b12;
	}

	public double getFolnaKiselina() {
		return folnaKiselina;
	}

	public void setFolnaKiselina(double folnaKiselina) {
		this.folnaKiselina = folnaKiselina;
	}
	
	

	
}
