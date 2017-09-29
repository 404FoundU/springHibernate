package io.xpelliars.springify.injection;

import org.springframework.stereotype.Component;

@Component
public class AWSEmailService implements IEmailService{

	@Override
	public void sendEmail(String to, String message) {
		System.out.println("_________AWS EMAIL______________");
		System.out.println("Sending following message to = " +to);
		System.out.println(buildHtml(message));
		System.out.println("____________________________________");
	}
	
	private String buildHtml(String message) {
		return "<html><head></head><body>" + message + "</body></html>";
	}
}
