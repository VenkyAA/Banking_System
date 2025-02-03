package com.microservices.loan_service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservices.loan_service.dto.AccountDTO;

import jakarta.validation.Valid;

@FeignClient(name = "ACCOUNT-SERVICE")
public interface AccountLClient {

    @GetMapping("/accounts/{id}")
    AccountDTO getAccountById(@Valid @PathVariable("id") long id);
}

