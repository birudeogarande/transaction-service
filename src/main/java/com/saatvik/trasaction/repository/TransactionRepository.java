package com.saatvik.trasaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saatvik.trasaction.entity.PaymentEntity;

public interface TransactionRepository extends JpaRepository<PaymentEntity, String> {

}
