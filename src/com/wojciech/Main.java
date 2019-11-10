package com.wojciech;

public class Main {

    public static void main(String[] args) {
        HedgeContract forward = new HedgeContract(
                "EUR", "PLN", HedgeContractSide.BaseCurrencyBought,
                4.2958, 2020, 5, 4);
        System.out.println(forward);
    }
}
