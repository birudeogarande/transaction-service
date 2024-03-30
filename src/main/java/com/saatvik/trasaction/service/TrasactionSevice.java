package com.saatvik.trasaction.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saatvik.trasaction.entity.PaymentEntity;
import com.saatvik.trasaction.repository.TransactionRepository;

@Service
public class TrasactionSevice {

	
	@Autowired
	private TransactionRepository transactionRepository;
	
	
	public PaymentEntity save(PaymentEntity entity) {
		
		return transactionRepository.save(entity);
	}
	
   public PaymentEntity getPaymentById(String id) throws Exception {
		return transactionRepository.findById(id)
				.orElseThrow(()->new Exception("No Payment found with id "+id));
	}


	public List<PaymentEntity> getAllPaymenyt() {
		return transactionRepository.findAll()
				.stream().collect(Collectors.toList());
	}
	
	


}
