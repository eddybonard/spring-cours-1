package com.company.invoice.core.services.number;

import com.company.invoice.core.entity.Invoice;
import com.company.invoice.core.repository.CustomerRepositoryInterface;
import com.company.invoice.core.repository.InvoiceRepositoryInterface;
import com.company.invoice.core.services.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class InvoiceServiceNumber implements InvoiceServiceInterface {

    @Qualifier("invoiceRepositoryInterface")
    @Autowired
    private final InvoiceRepositoryInterface invoiceRepository;

    @Autowired
    private final CustomerRepositoryInterface customerRepository;

    public InvoiceServiceNumber(@Qualifier("invoiceRepositoryInterface") InvoiceRepositoryInterface invoiceRepository, CustomerRepositoryInterface customerRepository) {
        this.invoiceRepository = invoiceRepository;
        this.customerRepository = customerRepository;
    }

    public InvoiceRepositoryInterface getInvoiceRepository() {
        return invoiceRepository;
    }

    @Transactional
    public Invoice  createInvoice(Invoice invoice){
        customerRepository.save(invoice.getCustomer());
        return invoiceRepository.save(invoice);
    }

    @Override
    public Iterable<Invoice> getInvoices() {
        return invoiceRepository.findAll();
    }

    @Override
    public Invoice getInvoice(String number) {
        return invoiceRepository.findById(number).orElseThrow();
    }
}
