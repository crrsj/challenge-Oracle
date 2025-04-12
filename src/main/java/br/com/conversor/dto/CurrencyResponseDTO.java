package br.com.conversor.dto;

public record CurrencyResponseDTO(

	 String result,
	 String base_code,
	 String target_code,
	 double conversion_rate) {   

	 }
