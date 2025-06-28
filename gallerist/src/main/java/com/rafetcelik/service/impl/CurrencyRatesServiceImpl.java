package com.rafetcelik.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.rafetcelik.dto.CurrencyRatesResponse;
import com.rafetcelik.exception.BaseException;
import com.rafetcelik.exception.ErrorMessage;
import com.rafetcelik.exception.MessageType;
import com.rafetcelik.service.ICurrencyRatesService;

@Service
public class CurrencyRatesServiceImpl implements ICurrencyRatesService{
	
	@Value("${tcmb.api.key}")
    private String apiKey;

	@Override
	public CurrencyRatesResponse getCurrencyRates(String startDate, String endDate) {
		String rootUrl = "https://evds2.tcmb.gov.tr/service/evds/";
		String series = "TP.DK.USD.A.YTL";
		String type = "json";
		
		String endPoint = rootUrl+"series="+series+"&startDate="+startDate+"&endDate="+endDate+"&type="+type;
		
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.set("key", apiKey);
		
		HttpEntity<?> httpEntity = new HttpEntity<>(httpHeaders);
		
		try {
			RestTemplate restTemplate = new RestTemplate();
			
			ResponseEntity<CurrencyRatesResponse> response = restTemplate.exchange(endPoint, HttpMethod.GET, httpEntity, new ParameterizedTypeReference<CurrencyRatesResponse>() {
			});
			if(response.getStatusCode().is2xxSuccessful()) {
				return response.getBody();
			}
		} catch (Exception e) {
			throw new BaseException(new ErrorMessage(MessageType.CURRENCY_RATES_IS_OCCURED, e.getMessage()));
		}
		return null;
	}

}
