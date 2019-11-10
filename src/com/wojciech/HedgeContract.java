package com.wojciech;

import java.util.Calendar;

import static java.util.Calendar.YEAR;

public class HedgeContract {
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
     * @param side 2 options from HedgeContractSide showing side form Base curr. perspektive
     * @param exchangeRate term rate of contract
     * @param year of delivery
     * @param mounth of delivery
     * @param day of delivery
     */
    public HedgeContract(String baseCurrency, String quoteCurrency, HedgeContractSide side, double exchangeRate, int year, int mounth, int day){
        this.baseCurrency = baseCurrency;
        this.quoteCurrency = quoteCurrency;
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
                ",\n exchangeRate=" + exchangeRate +
                ",\n issueDate=" + showIssueDate() +
                ",\n paymentDate=" + showPaymentDate() +
                '}';
    }

    //showing Calendar in good format
    private String showIssueDate() {
        return String.format("%d-%02d-%02d"
                , issueDate.get(YEAR), issueDate.get(Calendar.MONTH), issueDate.get(Calendar.DAY_OF_MONTH));
    }

    private String showPaymentDate() {
        return String.format("%d-%02d-%02d"
                ,paymentDate.get(YEAR), paymentDate.get(Calendar.MONTH), paymentDate.get(Calendar.DAY_OF_MONTH));
    }
}
