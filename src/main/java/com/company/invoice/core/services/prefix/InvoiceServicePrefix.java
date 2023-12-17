package com.company.invoice.core.services.prefix;

import com.company.invoice.core.entity.Invoice;
import com.company.invoice.core.repository.InvoiceRepositoryInterface;
import com.company.invoice.core.services.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
public class InvoiceServicePrefix implements InvoiceServiceInterface {

    @Value("${invoice.lastNumber}")
    private long lastNumber;

    @Value("${invoice.prefix}")
    private String prefix;

    @Autowired
    private final InvoiceRepositoryInterface invoiceRepository;

    public InvoiceServicePrefix(InvoiceRepositoryInterface invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public InvoiceRepositoryInterface getInvoiceRepository() {
        return invoiceRepository;
    }

    public Invoice  createInvoice(Invoice invoice){
        invoice.setNumber(prefix+(++lastNumber));
        invoiceRepository.save(invoice);

        return invoice;
    }

    @Override
    public Iterable<Invoice> getInvoices() {
        return invoiceRepository.findAll();
    }

    @Override
    public Invoice getInvoice(String number) {
        return invoiceRepository.findById(number).orElseThrow();
    }

    public long getLastNumber() {
        return lastNumber;
    }

    public void setLastNumber(long lastNumber) {
        this.lastNumber = lastNumber;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
}
