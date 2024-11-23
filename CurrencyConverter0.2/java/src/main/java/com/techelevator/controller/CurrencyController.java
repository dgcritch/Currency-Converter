package com.techelevator.controller;

import com.techelevator.services.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/currencies")
public class CurrencyController {

    @Autowired
    CurrencyService currencyService;

    @GetMapping
    public String getCurrencies() {

        return currencyService.getCurrencyString();
    }
}
