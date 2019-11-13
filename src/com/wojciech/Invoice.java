package com.wojciech;

import java.util.Calendar;

/**
 * Class used to store contracts that need to be hedged
 *
 * currency
 * amount
 * side - buy or sell (finnal)
 * payment date
 * issue date
 * issue date NBP rate
 *
 */
public class Invoice implements ShowDate{

    private String currency;
    private double amount;
    private Calendar paymentDate;
    private Calendar issueDate;
    private InvoiceType invoiceType;
    private double kursNbpPodatkowy;

    /*
      Initializes date fields
     */
    {
        issueDate = Calendar.getInstance();
        paymentDate = Calendar.getInstance();
    }

    /**
     *  Constructing invoice, NBP rate is taken from tables (to be set)
     *  isueDate is on day of registration
     *  payment day hour is on 23:59:59
     * @param currency of invoice
     * @param amount in currency
     * @param year of payment
     * @param month  of payment
     * @param day of payment
     * @param invoiceType asset or liability (Enum type)
     */
    public Invoice(String currency, double amount, int year, int month, int day, InvoiceType invoiceType) {
        this.currency = currency;
        this.amount = amount;
        paymentDate.set(year, month, day, 23, 59,59);
        this.invoiceType = invoiceType;
    }

    public Invoice (String currency, double amount, int year, int month, int day, InvoiceType invoiceType,
                    int yearStart, int monthStart, int dayStart){
        this(currency, amount, year, month, day, invoiceType);
        issueDate.set(yearStart, monthStart, dayStart);
    }


    @Override
    public String toString() {
        return "Invoice\n" +
                "{currency='" + currency + '\'' +
                ",\n amount=" + amount +
                ",\n paymentDate=" + ShowDate.showDate(paymentDate) +
                ",\n issueDate=" + ShowDate.showDate(issueDate) +
                ",\n invoiceType=" + invoiceType +
//                "\n, kursNbpPodatkowy=" + kursNbpPodatkowy +
                '}';
    }
}
