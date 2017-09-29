package io.xpelliars.springify;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tester {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		HelloSpring helloSpring = context.getBean(HelloSpring.class);
		
		helloSpring.sayHello();
		
		context.close();
	}
}
