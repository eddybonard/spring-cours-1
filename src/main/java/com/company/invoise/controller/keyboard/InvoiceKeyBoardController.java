package com.company.invoise.controller.keyboard;

import com.company.invoise.controller.InvoiceControllerInterface;
import com.company.invoise.entity.Invoice;
import com.company.invoise.services.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

//@Controller
public class InvoiceKeyBoardController implements InvoiceControllerInterface {

    @Autowired
    private final InvoiceServiceInterface invoiceServiceInterface;

    public InvoiceKeyBoardController(InvoiceServiceInterface invoiceServiceInterface) {
        this.invoiceServiceInterface = invoiceServiceInterface;
    }

    public InvoiceServiceInterface getInvoiceServiceInterface() {
        return invoiceServiceInterface;
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
