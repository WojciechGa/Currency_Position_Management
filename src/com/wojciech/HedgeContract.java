package com.wojciech;

import java.util.Calendar;


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

    public static class Builder{

        //obligatory fields
        private String baseCurrency;
        private String quoteCurrency;
        private double amount;
        private HedgeContractSide hedgeContractSide;
        private double exchangeRate;
        private Calendar paymentDate;

        //optional fields
        private final Calendar issueDate;


        //Initializes date fields
        {
            issueDate = Calendar.getInstance();
            paymentDate = Calendar.getInstance();
        }


        /**
         * Constructing new hedge contract with all required feelds
         * Sets paymentDate on 23:59:59
         * @param baseCurrency of contract
         * @param quoteCurrency of contract
         * @param amount of contract in base currency
         * @param side 2 options from HedgeContractSide showing side form Base curr. perspektive
         * @param exchangeRate term rate of contract
         * @param year of delivery
         * @param month of delivery
         * @param day of delivery
         */
        public Builder(String baseCurrency, String quoteCurrency, double amount,
                       HedgeContractSide side, double exchangeRate, int year, int month, int day){
            this.baseCurrency = baseCurrency;
            this.quoteCurrency = quoteCurrency;
            this.amount = amount;
            this.hedgeContractSide = side;
            this.exchangeRate = exchangeRate;
            paymentDate.set(year, month - 1, day, 23, 59,59);
        }

        public Builder issueDate(int year, int month, int day){
            issueDate.set(year, month - 1, day);
            return this;
        }

        public HedgeContract build(){
            return new HedgeContract(this);
        }
    }

    private HedgeContract (Builder builder){
        this.baseCurrency = builder.baseCurrency;
        this.quoteCurrency = builder.quoteCurrency;
        this.amount = builder.amount;
        this.hedgeContractSide = builder.hedgeContractSide;
        this.exchangeRate = builder.exchangeRate;
        this.paymentDate = builder.paymentDate;
        this.issueDate = builder.issueDate;
    }
}
