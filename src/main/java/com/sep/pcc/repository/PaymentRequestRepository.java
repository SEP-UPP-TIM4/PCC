package com.sep.pcc.repository;

import com.sep.pcc.model.PaymentRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PaymentRequestRepository extends JpaRepository<PaymentRequest, UUID> {
}
