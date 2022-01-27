package com.payment.service.consumer;

import java.util.function.Consumer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EventConsumer {

	@Bean
	Consumer<OrderDto> consume() {
		return event -> {
			System.out.println("Consumed message ==========>" + event);
		};
	}
}
