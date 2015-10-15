package edu.avans.ivh5.shared.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Invoice implements Serializable {

    private int invoiceNumber;
    private Date date, expirationDate;
    private BigDecimal VAT;
    
    //relaties
    private Treatment treatment;
    private InsuranceCompany company;

    public Invoice(int invoiceNumber, Date date, Date expirationDate, BigDecimal VAT) {
        this.invoiceNumber = invoiceNumber;
        this.date = date;
        this.expirationDate = expirationDate;
        this.VAT = VAT;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public Date getDate() {
        return date;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public BigDecimal getVAT() {
        return VAT;
    }
    
    public BigDecimal getTotalAmount() {
        BigDecimal treatmentPrice = treatment.getPrice();
        BigDecimal treatmentAmount = new BigDecimal(treatment.getAmountSessions());
        
        // Price * amount * vat
        return treatmentPrice.multiply(treatmentAmount).multiply(VAT);
    }
}
