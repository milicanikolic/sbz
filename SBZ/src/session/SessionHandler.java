package session;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

@Startup
@Singleton
public class SessionHandler {
	
	private KieSession kieSession;
	
	public SessionHandler() {
		
	}
	
	@PostConstruct
	public void init() {
		KieServices kieService= KieServices.Factory.get();
		KieContainer container= kieService.getKieClasspathContainer();
		kieSession = container.newKieSession("test-session");
	}

	public KieSession getKieSession() {
		return kieSession;
	}

	public void setKieSession(KieSession kieSession) {
		this.kieSession = kieSession;
	}
	
	

}
