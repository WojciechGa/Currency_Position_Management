package com.wojciech;

public class Main {

    public static void main(String[] args) {
        HedgeContract forward = new HedgeContract.Builder(
                "EUR", "PLN", 10000.00, HedgeContractSide.BaseCurrencyBought,
                4.2958, 2020, 5, 4).build();
        System.out.println(forward);

        Invoice invoice = new Invoice.Builder("EUR", 1000.00,
                2020, 5, 4, InvoiceType.liability).issueDate(2019, 8,10).build();
        System.out.println(invoice);
    }
}
