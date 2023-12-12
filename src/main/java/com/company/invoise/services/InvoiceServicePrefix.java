package com.company.invoise.services;

import com.company.invoise.entity.Invoice;
import com.company.invoise.repository.InvoiceRepositoryInterface;

public class InvoiceServicePrefix implements InvoiceServiceInterface {

    private static long lastNumber=112L;
    private InvoiceRepositoryInterface invoiceRepository;

    public InvoiceRepositoryInterface getInvoiceRepository() {
        return invoiceRepository;
    }

    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public void  createInvoice(Invoice invoice){
        invoice.setNumber(String.valueOf("INV_"+(++lastNumber)));
        invoiceRepository.create(invoice);
    }
}
