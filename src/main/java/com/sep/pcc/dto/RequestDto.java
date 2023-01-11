package com.sep.pcc.dto;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Currency;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RequestDto {

    private Long acquirerOrderId;

    private LocalDateTime acquirerTimestamp;

    @Size(min = 5)
    private String pan;

    private String cardholderName;

    private String cvv;

    private LocalDate expirationDate;

    private BigDecimal amount;

    private Currency currency;
}
