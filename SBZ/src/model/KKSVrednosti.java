package model;

import enums.Kolicina;

public class KKSVrednosti {
	private Kolicina eritrociti;
	private Kolicina leukociti;
	private Kolicina hemoglobin;
	private Kolicina hematokrit;
	private Kolicina mcv;
	private Kolicina mchc;
	private Kolicina trombociti;
	private Kolicina neu;
	private Kolicina lym;
	private Kolicina mon;
	private Kolicina eos;
	private Kolicina bas;
	private Kolicina urea;
	private Kolicina kreatinin;
	
	public KKSVrednosti() {
		eritrociti = Kolicina.NA;
		leukociti = Kolicina.NA;
		hemoglobin = Kolicina.NA;
		hematokrit = Kolicina.NA;
		mcv = Kolicina.NA;
		mchc = Kolicina.NA;
		trombociti = Kolicina.NA;
		neu = Kolicina.NA;
		lym = Kolicina.NA;
		mon = Kolicina.NA;
		eos = Kolicina.NA;
		bas = Kolicina.NA;
		urea=Kolicina.NA;
		kreatinin=Kolicina.NA;
	}

	public Kolicina getEritrociti() {
		return eritrociti;
	}

	public void setEritrociti(Kolicina eritrociti) {
		this.eritrociti = eritrociti;
	}

	public Kolicina getLeukociti() {
		return leukociti;
	}

	public void setLeukociti(Kolicina leukociti) {
		this.leukociti = leukociti;
	}

	public Kolicina getHemoglobin() {
		return hemoglobin;
	}

	public void setHemoglobin(Kolicina hemoglobin) {
		this.hemoglobin = hemoglobin;
	}

	public Kolicina getHematokrit() {
		return hematokrit;
	}

	public void setHematokrit(Kolicina hematokrit) {
		this.hematokrit = hematokrit;
	}

	public Kolicina getMcv() {
		return mcv;
	}

	public void setMcv(Kolicina mcv) {
		this.mcv = mcv;
	}

	public Kolicina getMchc() {
		return mchc;
	}

	public void setMchc(Kolicina mchc) {
		this.mchc = mchc;
	}

	public Kolicina getTrombociti() {
		return trombociti;
	}

	public void setTrombociti(Kolicina trombociti) {
		this.trombociti = trombociti;
	}

	public Kolicina getNeu() {
		return neu;
	}

	public void setNeu(Kolicina neu) {
		this.neu = neu;
	}

	public Kolicina getLym() {
		return lym;
	}

	public void setLym(Kolicina lym) {
		this.lym = lym;
	}

	public Kolicina getMon() {
		return mon;
	}

	public void setMon(Kolicina mon) {
		this.mon = mon;
	}

	public Kolicina getEos() {
		return eos;
	}

	public void setEos(Kolicina eos) {
		this.eos = eos;
	}

	public Kolicina getBas() {
		return bas;
	}

	public void setBas(Kolicina bas) {
		this.bas = bas;
	}

	public Kolicina getUrea() {
		return urea;
	}

	public void setUrea(Kolicina urea) {
		this.urea = urea;
	}

	public Kolicina getKreatinin() {
		return kreatinin;
	}

	public void setKreatinin(Kolicina kreatinin) {
		this.kreatinin = kreatinin;
	}
	
	public String toString(){
		return "KKS: eritrociti: "+this.getEritrociti()+" ,hemoglobin: "+this.getHemoglobin()+" ,hematokrit: "+this.getHematokrit()+" ,MCV: "+this.getMcv()+" ,MCHC: "+this.getMchc()
		+" ,trombociti: "+this.getTrombociti()+" ,leukociti: "+this.getLeukociti()+" ,neu: "+this.getNeu()+" ,monociti: "+this.getMon() 
		+" eos: "+this.getEos()+" ,bas: "+this.getBas()+" ,urea: "+this.getUrea()+" ,kreatinin: "+this.getKreatinin()+" ,limfociti: "+this.getLym();
	}
	
}
