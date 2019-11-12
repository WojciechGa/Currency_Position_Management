package com.wojciech;

public class Main {

    public static void main(String[] args) {
        HedgeContract forward = new HedgeContract(
                "EUR", "PLN", 10000.00, HedgeContractSide.BaseCurrencyBought,
                4.2958, 2020, 5, 4);
        System.out.println(forward);

        Invoice invoice = new Invoice("EUR", 1000.00,
                2020, 5, 4, InvoiceType.liability);
        System.out.println(invoice);
    }
}
