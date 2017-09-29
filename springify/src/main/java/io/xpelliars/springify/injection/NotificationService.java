package io.xpelliars.springify.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {
	
	@Autowired(required = false)
	private IEmailService emailService;
//	
	
	//Constructor DI
//	
//	public NotificationService(IEmailService service) {
//		emailService = service ;
//	}
	public void sendNotification(String to, String msg) {
		emailService.sendEmail(to, msg);
		
	}
	
	// setter based DI
//	@Autowired
//	public void setEmailService(IEmailService service) {
//		this.emailService = service;
//	}
	
}
