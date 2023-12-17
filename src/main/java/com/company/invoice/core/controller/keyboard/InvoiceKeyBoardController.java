package com.company.invoice.core.controller.keyboard;

import com.company.invoice.core.controller.InvoiceControllerInterface;
import com.company.invoice.core.entity.Customer;
import com.company.invoice.core.entity.Invoice;
import com.company.invoice.core.services.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

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

    public String createInvoice(Invoice invoice)
    {
        System.out.println( "What you customer name ? " );

        Scanner sc = new Scanner(System.in);

        String customerName = sc.nextLine();

        invoice = new Invoice();
        Customer customer = new Customer(customerName);
        invoice.setCustomer(customer);

        invoiceServiceInterface.createInvoice(invoice);

        return null;
    }
}
