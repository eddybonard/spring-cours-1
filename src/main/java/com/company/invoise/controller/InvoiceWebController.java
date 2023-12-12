package com.company.invoise.controller;

import com.company.invoise.entity.Invoice;
import com.company.invoise.services.InvoiceServiceInterface;

public class InvoiceWebController implements InvoiceControllerInterface{
    private InvoiceServiceInterface invoiceServiceInterface;

    public InvoiceServiceInterface getInvoiceServiceInterface() {
        return invoiceServiceInterface;
    }

    public void setInvoiceServiceInterface(InvoiceServiceInterface invoiceServiceInterface) {
        this.invoiceServiceInterface = invoiceServiceInterface;
    }

    public void createInvoice()
    {
        String customerName = "test";

        Invoice invoice = new Invoice();
        invoice.setCustomerName(customerName);

        invoiceServiceInterface.createInvoice(invoice);
    }
}
