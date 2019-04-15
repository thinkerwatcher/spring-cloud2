package com.cloud.young.server1.mq;

public abstract class AbstractMessageSender<T> {
	
	public abstract void sendMessage(T message);
	
}
