package com.company.invoise.controller;

import com.company.invoise.services.InvoiceServiceInterface;

public interface InvoiceControllerInterface {
    default void createInvoice() {};
}
