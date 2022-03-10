package com.example.springcloudstreamconsumer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

import com.example.springcloudstreamconsumer.SpringCloudStreamConsumerApplication;
import com.example.springcloudstreamconsumer.model.Book;

@EnableBinding(Sink.class)
public class KafkaStreamListener {

	private Logger logger = LoggerFactory.getLogger(KafkaStreamListener.class);

	@StreamListener("input")
	public void consumeMessage(Book book) {
		logger.info("consumed payload: " + book);
	}
}
