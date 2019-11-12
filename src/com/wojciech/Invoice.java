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

    /**
     *  Constructing invoice, NBP rate is taken from tables (to be set)
     *  isueDate is on day of registration
     * @param currency of invoice
     * @param amount in currency
     * @param year of payment
     * @param mounth  of payment
     * @param day of payment
     * @param invoiceType asset or liability (Enum type)
     */
    public Invoice(String currency, double amount, int year, int mounth, int day, InvoiceType invoiceType) {
        this.currency = currency;
        this.amount = amount;
        this.paymentDate = Calendar.getInstance();
        paymentDate.set(year, mounth, day);
        this.invoiceType = invoiceType;
        this.issueDate = Calendar.getInstance();
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
