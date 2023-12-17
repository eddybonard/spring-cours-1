package com.company.invoice.core.controller.scan;

import com.company.invoice.core.controller.InvoiceControllerInterface;
import com.company.invoice.core.entity.Customer;
import com.company.invoice.core.entity.Invoice;
import com.company.invoice.core.services.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

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

    public String createInvoice(Invoice invoice)
    {
        System.out.println( "Usage scanner ? " );
        invoice = new Invoice();
        Customer customer = new Customer("Virgin");
        invoice.setCustomer(customer);

        invoiceServiceInterface.createInvoice(invoice);

        return null;
    }
}
