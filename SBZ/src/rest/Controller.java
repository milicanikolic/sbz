package rest;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.kie.api.runtime.rule.FactHandle;

import enums.Bolesti;
import enums.DodatneAnalize;
import mail.SendMail;
import model.DodatnoAnemija1;
import model.DodatnoAnemija1Vrednosti;
import model.DodatnoAnemija2;
import model.DodatnoAnemija2Vrednosti;
import model.EnzimiJetre;
import model.EnzimiJetreVrednosti;
import model.EnzimiUKrvi;
import model.EnzimiUKrviVrednosti;
import model.KKS;
import model.KKSVrednosti;
import model.Pacijent;
import model.StitnaZlezda;
import model.StitnaZlezdaVrednosti;
import session.SessionHandler;

@LocalBean
@Path("/controller")
@Stateless
public class Controller {
	
	private List<String> ispis;
	
	@EJB
	SessionHandler sessionHandler;
	
	FactHandle factHandlePacijent;

	@PUT
	@Path("/fireRulesPatient")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void fireRulesPatient(Pacijent pacijent){
		System.out.println("fireRulesPatient");
		System.out.println(pacijent.toString());
		
		for(FactHandle factHandle: sessionHandler.getKieSession().getFactHandles()) {
			sessionHandler.getKieSession().delete(factHandle);
		}
		
		
		
		factHandlePacijent=sessionHandler.getKieSession().insert(pacijent);
        //int fired = kieSession.getKieSession().fireAllRules();
        
        //System.out.println( "Number of Rules executed = " + fired );
        
	}
	
	@Path("/fireRulesKKS")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String fireRulesKKS(KKS kks){
		System.out.println(kks.toString());
		
		

		for(FactHandle factHandle: sessionHandler.getKieSession().getFactHandles()) {
			if(!factHandle.equals(factHandlePacijent)){
			sessionHandler.getKieSession().delete(factHandle);
			}
		}
		
		
		KKSVrednosti kksVrednosti=new KKSVrednosti();
		sessionHandler.getKieSession().insert(kksVrednosti);
		sessionHandler.getKieSession().insert(kks);
		
		sessionHandler.getKieSession().getAgenda().getAgendaGroup("kks").setFocus();
		System.out.println(kksVrednosti.toString());
        int fired = sessionHandler.getKieSession().fireAllRules();
        System.out.println( "Number of Rules executed = " + fired );
     
        
        Pacijent pacijent=(Pacijent)(sessionHandler.getKieSession().getObject(factHandlePacijent));
        System.out.println(pacijent.bolestiToString());
        System.out.println(pacijent.getDodatneAnalize());
        
        String povratna="";
        
        if(pacijent.getDodatneAnalize().equals(DodatneAnalize.SIDERO) || pacijent.getDodatneAnalize().equals(DodatneAnalize.MEGALOBLASTNA)){
        	povratna="";
        	povratna+="Dodatna:"+pacijent.getDodatneAnalize();
        }else{
        	povratna="";
        	povratna+="Dodatna:";
        	//for(Bolesti b:pacijent.getBolesti()){
        		//povratna+=b+"\n";
        //	}
        }
        //treba dodati sve bolesti isto u string
        System.out.println("vraca u angular: "+povratna);
        return povratna;
	}
	@PUT
	@Path("/fireRulesLiver")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	
	public void fireRulesLiver(EnzimiJetre jetra){
		
		for(FactHandle factHandle: sessionHandler.getKieSession().getFactHandles()) {
			if(!factHandle.equals(factHandlePacijent)){
			sessionHandler.getKieSession().delete(factHandle);
			}
		}
		
		EnzimiJetreVrednosti vrednosti=new EnzimiJetreVrednosti();
		sessionHandler.getKieSession().insert(vrednosti);
		sessionHandler.getKieSession().insert(jetra);
		
		Pacijent pacijent=(Pacijent)(sessionHandler.getKieSession().getObject(factHandlePacijent));
		
		sessionHandler.getKieSession().getAgenda().getAgendaGroup("jetra").setFocus();
		
        sessionHandler.getKieSession().fireAllRules();
        System.out.println(vrednosti.toString());
        System.out.println(pacijent.bolestiToString());
	}
	

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/fireRulesAnemija1")
	public void fireRulesDodatno1(DodatnoAnemija1 dodatna1){
		
		for(FactHandle factHandle: sessionHandler.getKieSession().getFactHandles()) {
			if(!factHandle.equals(factHandlePacijent)){
			sessionHandler.getKieSession().delete(factHandle);
			}
		}
		
		DodatnoAnemija1Vrednosti vrednosti=new DodatnoAnemija1Vrednosti();
		sessionHandler.getKieSession().insert(vrednosti);
		sessionHandler.getKieSession().insert(dodatna1);
        
		Pacijent pacijent=(Pacijent)(sessionHandler.getKieSession().getObject(factHandlePacijent));
		pacijent.setDodatneAnalize(DodatneAnalize.OBAVLJENO);
		
		sessionHandler.getKieSession().getAgenda().getAgendaGroup("kks").setFocus();
		
		sessionHandler.getKieSession().fireAllRules();
        System.out.println( vrednosti.toString() );
        System.out.println(pacijent.bolestiToString());
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/fireRulesAnemija2")
	public void fireRulesDodatno2(DodatnoAnemija2 dodatno2){
		
		for(FactHandle factHandle: sessionHandler.getKieSession().getFactHandles()) {
			if(!factHandle.equals(factHandlePacijent)){
			sessionHandler.getKieSession().delete(factHandle);
			}
		}
		
		DodatnoAnemija2Vrednosti vred2=new DodatnoAnemija2Vrednosti();
		sessionHandler.getKieSession().insert(vred2);
		sessionHandler.getKieSession().insert(dodatno2);
		
		Pacijent pacijent=(Pacijent)(sessionHandler.getKieSession().getObject(factHandlePacijent));
		pacijent.setDodatneAnalize(DodatneAnalize.OBAVLJENO);
		
		sessionHandler.getKieSession().getAgenda().getAgendaGroup("kks").setFocus();
		
		sessionHandler.getKieSession().fireAllRules();
        System.out.println( vred2.toString());
        System.out.println(pacijent.bolestiToString());
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/fireRulesStitnaZlezda")
	public void fireRulesStitnaZlezda(StitnaZlezda stitna){
		
		for(FactHandle factHandle: sessionHandler.getKieSession().getFactHandles()) {
			if(!factHandle.equals(factHandlePacijent)){
			sessionHandler.getKieSession().delete(factHandle);
			}
		}
		
		StitnaZlezdaVrednosti vrednosti= new StitnaZlezdaVrednosti();
		sessionHandler.getKieSession().insert(vrednosti);
		sessionHandler.getKieSession().insert(stitna);
		
		Pacijent pacijent=(Pacijent)(sessionHandler.getKieSession().getObject(factHandlePacijent));
		
		sessionHandler.getKieSession().getAgenda().getAgendaGroup("stitna").setFocus();
		
		sessionHandler.getKieSession().fireAllRules();
        System.out.println( vrednosti.toString());
        System.out.println(pacijent.bolestiToString());
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/fireRulesEnzimiKrvi")
	public void fireRulesEnzimiKrvi(EnzimiUKrvi enzimi){
		
		for(FactHandle factHandle: sessionHandler.getKieSession().getFactHandles()) {
			if(!factHandle.equals(factHandlePacijent)){
			sessionHandler.getKieSession().delete(factHandle);
			}
		}
		
		EnzimiUKrviVrednosti vrednosti=new EnzimiUKrviVrednosti();
		sessionHandler.getKieSession().insert(vrednosti);
		sessionHandler.getKieSession().insert(enzimi);
		
		Pacijent pacijent=(Pacijent)(sessionHandler.getKieSession().getObject(factHandlePacijent));
		
		sessionHandler.getKieSession().getAgenda().getAgendaGroup("enzimiKrvi").setFocus();
		
		sessionHandler.getKieSession().fireAllRules();
        System.out.println( vrednosti.toString());
        System.out.println(pacijent.bolestiToString());
		
	}
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/uzmiBolesti")
	public List<String> uzmiBolesti(){
		Pacijent pacijent=(Pacijent)(sessionHandler.getKieSession().getObject(factHandlePacijent));
		List<Bolesti> bolesti= pacijent.getBolesti();
		ispis=new ArrayList<String>();
		boolean vrstaAnemije=false;
		boolean anemija=false;
		for(Bolesti prva:bolesti) {
			if(prva.equals(Bolesti.SIDEROBLASTNA_ANEMIJA) || prva.equals(Bolesti.SIDEROPENIJSKA_ANEMIJA) || prva.equals(Bolesti.MEGALOBLASTNA_ANEMIJA)) {
				vrstaAnemije=true;
				break;
			}
		}
			
			for(Bolesti druga:bolesti) {
				if(druga.equals(Bolesti.ANEMIJA)) {
					anemija=true;
					break;
				}
			}
				
		if(anemija) {
			if(vrstaAnemije) {
				bolesti.remove(Bolesti.ANEMIJA);
			}
			}
		
		
		
		for(Bolesti b:bolesti){
			switch (b) {
			case ANEMIJA:{
				ispis.add("ANEMIJA (Za detaljnije analize obratite se hematologu)");
				break;
			}
			case SIDEROPENIJSKA_ANEMIJA :{
				ispis.add("SIDEROPENIJSKA ANEMIJA (Za detaljnije analize obratite se hematologu)");
				break;
				
			}case MEGALOBLASTNA_ANEMIJA:{
				ispis.add("MEGALOBLASTNA ANEMIJA (Za detaljnije analize obratite se hematologu)");
				break;
				
			}case SIDEROBLASTNA_ANEMIJA:{
				ispis.add("SIDEROBLASTNA ANEMIJA (Za detaljnije analize obratite se hematologu)");
				break;
				
			}case BAKTERIJSKO_ZAPALJENJE:{
				ispis.add("BAKTERIJSKO ZAPALJENJE");
				break;
				
			}case VIRUSNO_ZAPALJENJE:{
				ispis.add("VIRUSNO ZAPALJENJE");
				break;
				
			}case INFEKCIJE:{
				ispis.add("ALERGIJSKA REAKCIJA/PARAZITALNA INFEKCIJA (Potrebno je izvrsiti dodatne alergo-testove)");
				break;
				
			}case LEUKEMIJA:{
				ispis.add("LEUKEMIJA");
				break;
				
			} case PANCITOPENIJA:{
				ispis.add("PANCITOPENIJA - snizene vrednosti svih celija u krvi (Za detaljnije analize obratite se hematologu)");
				break;
				
			} case JETRA:{
				ispis.add("BOLESTI JETRE - sumnja se na hepatitis, cirozu ili neko drugo oboljenje jetre (Za detaljnije analize obratite se gastroenterologu)");
				break;
				
			} case ZUCNI_PUTEVI:{
				ispis.add("BOLESTI ZUCNIH PUTEVA (Za detaljnije analize obratite se gastroenterologu)");
				break;
				
			}case ADENOHIPOFIZA:{
				ispis.add("OBOLJENJE U ADENOHIPOFIZI - sumnja se na benigni ili maligni tumor na adenohipofizi");
				break;
				
			}case HIPERTIREOZA:{
				ispis.add("HIPERTIREOZA - oboljenje stitne zlezde");
				break;
				
			}case PANKREATITIS:{
				ispis.add("PANKREATITIS - zapaljenje pankreasa (Za detaljnije analize obratite se gastroenterologu)");
				break;
				
			}case INFARKT_MIOKARDA:{
				ispis.add("<a href=\"www.google.rs\">INFARKT MIOKARDA </a>");
				break;
				
			}
			case BUBREZI:{
				ispis.add("BOLESTI BUBREGA - zahteva se pregled urina (Za detaljnije analize obratite se nefrologu)");
				break;
				
			}
			}
		}
		
		//return pacijent.getBolesti();
		return ispis;
	}
	
	
	@POST
	 @Consumes(MediaType.APPLICATION_JSON)
	 @Path("/posaljiMejl")
	 public void posaljiMejl(String mejl){
	  String to = mejl;
	  String subject = "Rezultati";
	  String message = "Na osnovu obradjenih rezultata, postoje sumnje na sledece bolesti: \n \n";
	  
	  for(String s:ispis) {
		  message+= "-" +  s + "\n";
	  }

	 System.out.println("mejl " +mejl);
	 System.out.println(message);
	  SendMail sendMail = new SendMail(to, subject, message);
	  sendMail.send();
	 }	
	
	
}
