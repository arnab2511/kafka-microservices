/**
 * 
 */
package com.arnab.processor;

import java.util.function.Function;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author arnab
 *
 */
@Configuration
public class DomainKafkaProcessor {
	
	
	  @Bean public Function<KStream<String,Domain>,KStream<String,Domain>> domainProcessor(){
	  
		  return kstream -> kstream.filter((key,domain)-> {
			  
			  if (domain.isDead) {
				  System.out.print("Inactive domain "+domain.getDomain());
			  } else {
				  System.out.print("Active domain "+domain.getDomain());

			  }
			  return !domain.isDead();
		  });
	  }
	 

	
}
