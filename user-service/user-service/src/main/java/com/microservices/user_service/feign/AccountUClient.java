package com.microservices.user_service.feign;

import com.microservices.user_service.dto.AccountDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "account-service")
public interface AccountUClient {

    @GetMapping("/accounts/{id}")
    AccountDTO getAccountById(@PathVariable("id") long id);
}

