package com.company.invoise.controller;

import com.company.invoise.entity.Invoice;
import com.company.invoise.services.InvoiceServiceInterface;

public class InvoiceDouchetteController implements InvoiceControllerInterface {
    private InvoiceServiceInterface invoiceServiceInterface;

    public InvoiceServiceInterface getInvoiceServiceInterface() {
        return invoiceServiceInterface;
    }

    public void setInvoiceServiceInterface(InvoiceServiceInterface invoiceServiceInterface) {
        this.invoiceServiceInterface = invoiceServiceInterface;
    }

    public void createInvoice()
    {
        System.out.println( "Usage scanner ? " );
        Invoice invoice = new Invoice();
        invoice.setCustomerName("virgin");

        invoiceServiceInterface.createInvoice(invoice);
    }
}
