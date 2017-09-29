package io.xpelliars.springify.injection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tester {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		NotificationService notificationService = context.getBean(NotificationService.class);
		notificationService.sendNotification("test@gmail.com", "How are you? ");		
		context.close();
	}
}
