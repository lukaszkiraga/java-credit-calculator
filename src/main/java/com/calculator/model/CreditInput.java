package com.calculator.model;

import java.util.Objects;
//zastosować Buildera, przerobic na lomboka
//pododawać reszte pól
public class CreditInput {

    private final int creditPeriod;

    public CreditInput(int creditPeriod) {
        this.creditPeriod = creditPeriod;
    }

    public int getCreditPeriod() {
        return creditPeriod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditInput that = (CreditInput) o;
        return creditPeriod == that.creditPeriod;
    }

    @Override
    public int hashCode() {
        return Objects.hash(creditPeriod);
    }

    @Override
    public String toString() {
        return "CreditInput{" +
                "creditPeriod=" + creditPeriod +
                '}';
    }
}
