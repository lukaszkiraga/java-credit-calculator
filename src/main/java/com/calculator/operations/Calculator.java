package com.calculator.operations;

import com.calculator.model.CreditInput;
import com.calculator.model.Offer;

import java.util.List;

public interface Calculator {

    List<Offer> getOffers(CreditInput creditInput);
}
