package com.saatvik.trasaction.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saatvik.trasaction.entity.PaymentEntity;
import com.saatvik.trasaction.service.TrasactionSevice;



@RestController
@RequestMapping("/payment")
public class TrasactionController {

	
	@Autowired
	private TrasactionSevice trasactionSevice;
	
	
	@GetMapping("/all")
	public List<PaymentEntity> getAllPaymenyt() {
		return trasactionSevice.getAllPaymenyt();
	}
	
	@PostMapping("/")
	public PaymentEntity savePayment(@RequestBody PaymentEntity entity) {
		return trasactionSevice.save(entity);
	}

	@GetMapping("/{id}")
	public PaymentEntity getPaymenytById(@PathVariable String id) throws Exception {
		return trasactionSevice.getPaymentById(id);
	}

	
}
