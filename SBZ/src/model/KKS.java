package model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class KKS implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3084392749256786837L;
	
	private double eritrociti;
	private double leukociti;
	private double hemoglobin;
	private double hematokrit;
	private double mcv;
	private double mchc;
	private double trombociti;
	private double neu;
	private double lym;
	private double mon;
	private double eos;
	private double bas;
	private double urea;
	private double kreatinin;
	
	public KKS(){
		
	}

	public KKS(double eritrociti, double leukociti, double hemoglobin, double hematokrit, double mcv,
			double mchc, double trombociti, double neu, double lym, double mon, double eos, double bas, double urea, double kreatinin) {
		super();
		this.eritrociti = eritrociti;
		this.leukociti = leukociti;
		this.hemoglobin = hemoglobin;
		this.hematokrit = hematokrit;
		this.mcv = mcv;

		this.mchc = mchc;
		this.trombociti = trombociti;
		this.neu = neu;
		this.lym = lym;
		this.mon = mon;
		this.eos = eos;
		this.bas = bas;
		
		this.urea=urea;
		this.kreatinin=kreatinin;
	}

	public double getEritrociti() {
		return eritrociti;
	}

	public void setEritrociti(double eritrociti) {
		this.eritrociti = eritrociti;
	}

	public double getLeukociti() {
		return leukociti;
	}

	public void setLeukociti(double leukociti) {
		this.leukociti = leukociti;
	}

	public double getHemoglobin() {
		return hemoglobin;
	}

	public void setHemoglobin(double hemoglobin) {
		this.hemoglobin = hemoglobin;
	}

	public double getHematokrit() {
		return hematokrit;
	}

	public void setHematokrit(double hematokrit) {
		this.hematokrit = hematokrit;
	}

	public double getMcv() {
		return mcv;
	}

	public void setMcv(double mcv) {
		this.mcv = mcv;
	}


	public double getMchc() {
		return mchc;
	}

	public void setMchc(double mchc) {
		this.mchc = mchc;
	}

	public double getTrombociti() {
		return trombociti;
	}

	public void setTrombociti(double trombociti) {
		this.trombociti = trombociti;
	}

	public double getNeu() {
		return neu;
	}

	public void setNeu(double neu) {
		this.neu = neu;
	}

	public double getLym() {
		return lym;
	}

	public void setLym(double lym) {
		this.lym = lym;
	}

	public double getMon() {
		return mon;
	}

	public void setMon(double mon) {
		this.mon = mon;
	}

	public double getEos() {
		return eos;
	}

	public void setEos(double eos) {
		this.eos = eos;
	}

	public double getBas() {
		return bas;
	}

	public void setBas(double bas) {
		this.bas = bas;
	}
	
	
	
	public double getUrea() {
		return urea;
	}

	public void setUrea(double urea) {
		this.urea = urea;
	}

	public double getKreatinin() {
		return kreatinin;
	}

	public void setKreatinin(double kreatinin) {
		this.kreatinin = kreatinin;
	}

	public String toString(){
		return "KKS: eritrociti: "+this.getEritrociti()+" ,hemoglobin: "+this.getHemoglobin()+" ,hematokrit: "+this.getHematokrit()+" ,MCV: "+this.getMcv()+" ,MCHC: "+this.getMchc()
		+" ,trombociti: "+this.getTrombociti()+" ,leukociti: "+this.getLeukociti()+" ,neu: "+this.getNeu()+" ,monociti: "+this.getMon() 
		+" eos: "+this.getEos()+" ,bas: "+this.getBas()+" ,urea: "+this.getUrea()+" ,kreatinin: "+this.getKreatinin()+" ,limfociti: "+this.getLym();
	}

}
