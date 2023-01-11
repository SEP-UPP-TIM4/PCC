package com.sep.pcc.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDto {

    private Long acquirerOrderId;

    private LocalDateTime acquirerTimestamp;

    private Long issuerOrderId;

    private LocalDateTime issuerTimestamp;

    private boolean success;
}
