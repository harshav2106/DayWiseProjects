package com.wipro.paymentms2.config;

import java.util.HashMap;
import java.util.Map;

import com.wipro.paymentms2.entity.Payment;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

@Configuration
public class ConsumerConfigApp {

	@Bean
	public ConsumerFactory<String, Payment> consumerFactory() {
	    JsonDeserializer<Payment> deserializer = new JsonDeserializer<>(Payment.class);
	    deserializer.addTrustedPackages("com.wipro.paymentms2.entity");

	    Map<String, Object> config = new HashMap<>();
	    config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
	    config.put(ConsumerConfig.GROUP_ID_CONFIG, "payment_service");
	    config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
	    config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, deserializer);

	    return new DefaultKafkaConsumerFactory<>(config, new StringDeserializer(), deserializer);
	}

	@Bean
	public ConcurrentKafkaListenerContainerFactory<String, Payment> kafkaListenerContainerFactory() {
	    ConcurrentKafkaListenerContainerFactory<String, Payment> factory = 
	        new ConcurrentKafkaListenerContainerFactory<>();
	    factory.setConsumerFactory(consumerFactory());
	    return factory;
	}


}
