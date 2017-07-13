package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import enums.Bolesti;
import enums.DodatneAnalize;

@XmlRootElement
public class Pacijent implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5092336562715991633L;
	
	private String ime;
	private String prezime;
	private int godine;
	private boolean zensko;
	private List<Bolesti> bolesti;
	private DodatneAnalize dodatneAnalize;
	
	private boolean leukemija;
	private boolean virus;
	private boolean bakterija;
	private boolean anemija;
	private boolean sideropenijska;
	private boolean sideroblastna;
	private boolean megaloblastna;
	private boolean infekcija;
	private boolean pancitopenija;
	private boolean bubrezi;
	private boolean jetra;
	private boolean zuc;
	private boolean adenohipofiza;
	private boolean hipertireoza;
	private boolean pankreatitis;
	private boolean infarkt;
	
	public Pacijent(){
		anemija=false;
		sideropenijska=false;
		sideroblastna=false;
		megaloblastna=false;
		infekcija=false;
		pancitopenija=false;
		bubrezi=false;
		jetra=false;
		zuc=false;
		adenohipofiza=false;
		hipertireoza=false;
		pankreatitis=false;
		infarkt=false;
		bakterija=false;
		leukemija=false;
		virus=false;
		bolesti=new ArrayList<Bolesti>();
		dodatneAnalize=DodatneAnalize.NA;
	}

	public Pacijent(String ime, String prezime, int godine, boolean zensko) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.godine = godine;
		this.zensko = zensko;
	}



	public boolean isZensko() {
		return zensko;
	}



	public void setZensko(boolean zensko) {
		this.zensko = zensko;
	}





	public boolean isAnemija() {
		return anemija;
	}

	public void setAnemija(boolean anemija) {
		this.anemija = anemija;
	}

	public boolean isSideropenijska() {
		return sideropenijska;
	}

	public void setSideropenijska(boolean sideropenijska) {
		this.sideropenijska = sideropenijska;
	}

	public boolean isSideroblastna() {
		return sideroblastna;
	}

	public void setSideroblastna(boolean sideroblastna) {
		this.sideroblastna = sideroblastna;
	}

	public boolean isMegaloblastna() {
		return megaloblastna;
	}

	public void setMegaloblastna(boolean megaloblastna) {
		this.megaloblastna = megaloblastna;
	}

	public boolean isInfekcija() {
		return infekcija;
	}

	public void setInfekcija(boolean infekcija) {
		this.infekcija = infekcija;
	}

	public boolean isPancitopenija() {
		return pancitopenija;
	}

	public void setPancitopenija(boolean pancitopenija) {
		this.pancitopenija = pancitopenija;
	}

	public boolean isBubrezi() {
		return bubrezi;
	}

	public void setBubrezi(boolean bubrezi) {
		this.bubrezi = bubrezi;
	}

	public boolean isJetra() {
		return jetra;
	}

	public void setJetra(boolean jetra) {
		this.jetra = jetra;
	}

	public boolean isZuc() {
		return zuc;
	}

	public void setZuc(boolean zuc) {
		this.zuc = zuc;
	}

	public boolean isAdenohipofiza() {
		return adenohipofiza;
	}

	public void setAdenohipofiza(boolean adenohipofiza) {
		this.adenohipofiza = adenohipofiza;
	}

	public boolean isHipertireoza() {
		return hipertireoza;
	}

	public void setHipertireoza(boolean hipertireoza) {
		this.hipertireoza = hipertireoza;
	}

	public boolean isPankreatitis() {
		return pankreatitis;
	}

	public void setPankreatitis(boolean pankreatitis) {
		this.pankreatitis = pankreatitis;
	}

	public boolean isInfarkt() {
		return infarkt;
	}

	public void setInfarkt(boolean infarkt) {
		this.infarkt = infarkt;
	}

	public boolean isBakterija() {
		return bakterija;
	}

	public void setBakterija(boolean bakterija) {
		this.bakterija = bakterija;
	}

	public boolean isLeukemija() {
		return leukemija;
	}

	public void setLeukemija(boolean leukemija) {
		this.leukemija = leukemija;
	}

	public boolean isVirus() {
		return virus;
	}

	public void setVirus(boolean virus) {
		this.virus = virus;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public int getGodine() {
		return godine;
	}

	public void setGodine(int godine) {
		this.godine = godine;
	}

	public String toString(){
		return "Pacijnet: ime: "+this.getIme()+" prezime: "+this.getPrezime()+" godine: "+this.getGodine()+" zensko: "+this.isZensko();
	}

	public List<Bolesti> getBolesti() {
		return bolesti;
	}

	public void setBolesti(List<Bolesti> bolesti) {
		this.bolesti = bolesti;
	}

	
	public DodatneAnalize getDodatneAnalize() {
		return dodatneAnalize;
	}

	public void setDodatneAnalize(DodatneAnalize dodatneAnalize) {
		this.dodatneAnalize = dodatneAnalize;
	}

	public String bolestiToString() {
		String s="";
		if(bolesti.size()>0){
		for(int i=0; i<bolesti.size()-1; i++) {
			s+=bolesti.get(i)+"\n";
		}
		s+=bolesti.get(bolesti.size()-1);
		}
		return s;
	}
	
	public void dodajBolest(Bolesti b) {
		if(!bolesti.contains(b)){
		bolesti.add(b);
		}
	
	}
	
}
