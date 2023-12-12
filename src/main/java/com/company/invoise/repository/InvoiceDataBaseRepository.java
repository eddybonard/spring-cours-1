package com.company.invoise.repository;

import com.company.invoise.entity.Invoice;

import java.util.ArrayList;
import java.util.List;

public class InvoiceDataBaseRepository implements InvoiceRepositoryInterface {
    private List<Invoice> invoices = new ArrayList<>();
    public void create(Invoice invoice){
        invoices.add(invoice);
        System.out.println("Invoice add : " + invoice.getNumber() + " for "+ invoice.getCustomerName());
    }
}
