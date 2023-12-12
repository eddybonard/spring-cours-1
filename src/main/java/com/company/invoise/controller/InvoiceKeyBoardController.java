package com.company.invoise.controller;

import com.company.invoise.entity.Invoice;
import com.company.invoise.services.InvoiceServiceInterface;

import java.util.Scanner;

public class InvoiceKeyBoardController implements InvoiceControllerInterface {
    private InvoiceServiceInterface invoiceServiceInterface;

    public InvoiceServiceInterface getInvoiceServiceInterface() {
        return invoiceServiceInterface;
    }

    public void setInvoiceServiceInterface(InvoiceServiceInterface invoiceServiceInterface) {
        this.invoiceServiceInterface = invoiceServiceInterface;
    }

    public void createInvoice()
    {
        System.out.println( "What you customer name ? " );

        Scanner sc = new Scanner(System.in);

        String customerName = sc.nextLine();

        Invoice invoice = new Invoice();
        invoice.setCustomerName(customerName);

        invoiceServiceInterface.createInvoice(invoice);
    }
}
