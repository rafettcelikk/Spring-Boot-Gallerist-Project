package com.rafetcelik.controller;

import com.rafetcelik.dto.CurrencyRatesResponse;

public interface IRestCurrencyRatesController {
	
	public RootEntity<CurrencyRatesResponse> getCurrencyRates(String startDate, String endDate);
}
