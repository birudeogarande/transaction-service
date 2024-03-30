package com.saatvik.trasaction.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity(name = "tb_payment")
@NoArgsConstructor
@AllArgsConstructor
public class PaymentEntity {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.UUID)
	private String paymentId;
	
	private Double amount;
	
	@Column(name = "payment_mode")
	private String paymentMode; 
	
	
	
}
