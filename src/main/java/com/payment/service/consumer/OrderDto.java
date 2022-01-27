package com.payment.service.consumer;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OrderDto {

	private int price;
	private int userId;
	private int quantity;
	private int productId;
}