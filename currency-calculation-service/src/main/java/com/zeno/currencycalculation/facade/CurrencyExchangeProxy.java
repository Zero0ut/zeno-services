package com.zeno.currencycalculation.facade;

import com.zeno.currencycalculation.model.CalculatedAmount;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "currency-calculation-service", url = "http://localhost:8000/")
public interface CurrencyExchangeProxy {

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CalculatedAmount retrieveExchangeValue(@PathVariable("from") String from,
                                                  @PathVariable("to") String to);

}
