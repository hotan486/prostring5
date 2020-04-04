package com.apress.prospring5.ch3.setterInjection;

public interface NewsletterSender {
	
	void setSmtpServer(String smtpSever);
	String getSmtServer();
	void setFromAddress(String fromAddress);
	String getFromAddress();
	
	void send();
	
}
