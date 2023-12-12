package com.company.invoise.repository;

import com.company.invoise.entity.Invoice;

public interface InvoiceRepositoryInterface {
    default void create(Invoice invoice){};
}
