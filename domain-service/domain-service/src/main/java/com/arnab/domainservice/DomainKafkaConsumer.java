package com.arnab.domainservice;

import java.util.function.Consumer;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DomainKafkaConsumer {
	
	@Bean
	public Consumer<KStream<String,Domain>> domainService(){
		
		return kstream -> kstream.foreach((key,domain)-> {
		System.out.println(String.format("Domain Consumed ", domain.getDomain(),domain.isDead()));
		});
	}

}
