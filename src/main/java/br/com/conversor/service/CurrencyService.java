package br.com.conversor.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.conversor.dto.CurrencyResponseDTO;

@Service
public class CurrencyService {
	
	private static final String API_KEY = "c1c550718c3d1bc81af62f2b";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6";

    public CurrencyResponseDTO getExchangeRate(String from, String to) {
        String url = String.format("%s/%s/pair/%s/%s", BASE_URL, API_KEY, from, to);

        RestTemplate restTemplate = new RestTemplate();
        var response = restTemplate.getForObject(url, CurrencyResponseDTO.class);

        if (response == null || !"success".equalsIgnoreCase(response.result())) {
            throw new RuntimeException("Erro ao buscar taxa de câmbio");
        }

        return response;
    }

    public double convertCurrency(String from, String to, double amount) {
        CurrencyResponseDTO rateResponse = getExchangeRate(from, to);
        return rateResponse.conversion_rate() * amount;
    }
}	 