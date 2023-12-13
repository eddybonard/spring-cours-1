package com.company.invoise.controller.scan;

import com.company.invoise.controller.InvoiceControllerInterface;
import com.company.invoise.entity.Invoice;
import com.company.invoise.services.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//@Controller
public class InvoiceDouchetteController implements InvoiceControllerInterface {

    @Autowired
    private final InvoiceServiceInterface invoiceServiceInterface;

    public InvoiceDouchetteController(InvoiceServiceInterface invoiceServiceInterface) {
        this.invoiceServiceInterface = invoiceServiceInterface;
    }

    public InvoiceServiceInterface getInvoiceServiceInterface() {
        return invoiceServiceInterface;
    }

    public void createInvoice()
    {
        System.out.println( "Usage scanner ? " );
        Invoice invoice = new Invoice();
        invoice.setCustomerName("virgin");

        invoiceServiceInterface.createInvoice(invoice);
    }
}
