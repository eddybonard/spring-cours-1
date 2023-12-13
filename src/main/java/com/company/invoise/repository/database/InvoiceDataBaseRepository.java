package com.company.invoise.repository.database;

import com.company.invoise.entity.Invoice;
import com.company.invoise.repository.InvoiceRepositoryInterface;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InvoiceDataBaseRepository implements InvoiceRepositoryInterface {
    private List<Invoice> invoices = new ArrayList<>();
    public void create(Invoice invoice){
        invoices.add(invoice);
        System.out.println("Invoice add : " + invoice.getNumber() + " for "+ invoice.getCustomerName());
    }
}
