package com.sep.pcc.controller;


import com.sep.pcc.dto.RequestDto;
import com.sep.pcc.dto.ResponseDto;
import com.sep.pcc.model.PaymentRequest;
import com.sep.pcc.service.PccService;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/pcc")
public class PccController {

    private final PccService service;

    public PccController(PccService service) {
        this.service = service;
    }

    @PostMapping("forward")
    public ResponseDto forward(@RequestBody @Valid RequestDto dto) {
        return service.forward(dto);
    }


}
