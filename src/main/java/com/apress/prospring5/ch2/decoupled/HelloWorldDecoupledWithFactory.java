package com.apress.prospring5.ch2.decoupled;

public class HelloWorldDecoupledWithFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageRenderer messageRenderer = MessageSupportFactory.getMessageSupportFactory().getmMessageRenderer();
		MessageProvider messageProvider = MessageSupportFactory.getMessageSupportFactory().getMessageProvider();
		
		messageRenderer.setMessageProvider(messageProvider);
		messageRenderer.render();
	}

}
