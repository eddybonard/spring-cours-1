package com.company.invoise.services;

import com.company.invoise.entity.Invoice;
import com.company.invoise.repository.InvoiceRepositoryInterface;

public interface InvoiceServiceInterface {
    default void  createInvoice(Invoice invoice){};
    default void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository){};
}
