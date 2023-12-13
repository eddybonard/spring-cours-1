package com.company.invoise.controller.web;

import com.company.invoise.controller.InvoiceControllerInterface;
import com.company.invoise.entity.Invoice;
import com.company.invoise.services.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class InvoiceWebController implements InvoiceControllerInterface {

    @Autowired
    private final InvoiceServiceInterface invoiceServiceInterface;

    public InvoiceWebController(InvoiceServiceInterface invoiceServiceInterface) {
        this.invoiceServiceInterface = invoiceServiceInterface;
    }

    public InvoiceServiceInterface getInvoiceServiceInterface() {
        return invoiceServiceInterface;
    }

    public void createInvoice()
    {
        String customerName = "test";

        Invoice invoice = new Invoice();
        invoice.setCustomerName(customerName);

        invoiceServiceInterface.createInvoice(invoice);
    }
}
