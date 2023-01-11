package com.sep.pcc.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Currency;
import java.util.UUID;

@Entity
@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PaymentRequest {

    @Id
    @GeneratedValue
    private UUID id;

    @Setter
    private Long acquirerOrderId;

    @Setter
    private LocalDateTime acquirerTimestamp;

    @Setter
    private String pan;

    @Setter
    private String cardholderName;

    @Setter
    private String cvv;

    @Setter
    private LocalDate expirationDate;

    @Setter
    private BigDecimal amount;

    @Setter
    private Currency currency;

    @Setter
    @Nullable
    @Builder.Default
    private Boolean success = null;
}
