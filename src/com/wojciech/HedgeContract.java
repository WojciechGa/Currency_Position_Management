package com.wojciech;

import java.util.Calendar;

import static java.util.Calendar.YEAR;

/**
 * Class describing hedge contract and it's details.
 * It shows positions that are secured.
 *
 */
public class HedgeContract implements ShowDate {
    private double amount;
    private String baseCurrency;
    private String quoteCurrency;
    private HedgeContractSide hedgeContractSide;
    private double exchangeRate;
    private final Calendar issueDate;
    private Calendar paymentDate;

    /**
     * Constructing new hedge contract with all required feelds
     * @param baseCurrency of contract
     * @param quoteCurrency of contract
     * @param amount of contract in base currency
     * @param side 2 options from HedgeContractSide showing side form Base curr. perspektive
     * @param exchangeRate term rate of contract
     * @param year of delivery
     * @param mounth of delivery
     * @param day of delivery
     */
    public HedgeContract(String baseCurrency, String quoteCurrency, double amount,
                         HedgeContractSide side, double exchangeRate, int year, int mounth, int day){
        this.baseCurrency = baseCurrency;
        this.quoteCurrency = quoteCurrency;
        this.amount = amount;
        this.hedgeContractSide = side;
        this.exchangeRate = exchangeRate;
        issueDate = Calendar.getInstance();
        paymentDate = Calendar.getInstance();
        paymentDate.set(year, mounth, day);
    }

    /**
     *
     * @return all instances that are essential for this class
     */
    @Override
    public String toString() {
        return "HedgeContract:\n{" +
                "baseCurrency='" + baseCurrency + '\'' +
                ",\n quoteCurrency='" + quoteCurrency + '\'' +
                ",\n hedgeContractSide=" + hedgeContractSide +
                ",\n baseCurrencyamount=" +amount +
                ",\n exchangeRate=" + exchangeRate +
                ",\n issueDate=" + ShowDate.showDate(issueDate) +
                ",\n paymentDate=" + ShowDate.showDate(paymentDate) +
                '}';
    }

}
