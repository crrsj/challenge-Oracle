package br.com.conversor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.conversor.service.CurrencyService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;


@RestController
@RequestMapping("/api/v1/currency")

public class CurrencyController {
	
	@Autowired
	 private CurrencyService currencyService;
	
	    @GetMapping("/convert")	 
	    @ResponseStatus(HttpStatus.OK)
	    @Operation(summary = "Endpoint responsável pela conversão de moedas.") 
	    @ApiResponse(responseCode = "200",description = " sucesso",content = {
	   	@Content(mediaType = "application.json",schema = @Schema(implementation = ResponseEntity.class))
	    })       
	    public double convertCurrency(
	        @RequestParam String from,
	        @RequestParam String to,
	        @RequestParam double amount) {
	        return  currencyService.convertCurrency(from, to, amount);
	       
	    }

}
