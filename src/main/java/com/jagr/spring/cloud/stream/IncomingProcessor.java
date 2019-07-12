package com.jagr.spring.cloud.stream;


import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface IncomingProcessor {

	String INCOMMING_STREAM = "incoming";

	@Input
	SubscribableChannel incoming();

}
