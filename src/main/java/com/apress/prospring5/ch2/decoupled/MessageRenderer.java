package com.apress.prospring5.ch2.decoupled;

//가져온 메세지를 보여줌
public interface MessageRenderer {
	//
	void render();
	//
	void setMessageProvider(MessageProvider messageProvider);
	MessageProvider getmMessageProvider();
}
