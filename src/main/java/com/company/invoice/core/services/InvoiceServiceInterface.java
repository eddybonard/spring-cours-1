package com.company.invoice.core.services;

import com.company.invoice.core.entity.Invoice;

import java.util.List;

public interface InvoiceServiceInterface {
     Invoice createInvoice(Invoice invoice);

    Iterable<Invoice> getInvoices();

    Invoice getInvoice(String number);
}
