package com.company.invoice.core.repository.memory;

import com.company.invoice.core.entity.Invoice;
import com.company.invoice.core.repository.InvoiceRepositoryInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//@Repository
public class InvoiceRepositoryMemory implements InvoiceRepositoryInterface {
    private static  List<Invoice> invoices= new ArrayList<>();

    public Invoice save(Invoice invoice){
        invoices.add(invoice);
        System.out.println("Invoice add : " + invoice.getNumber() + " for "+ invoice.getCustomer().getName());

        return invoice;
    }

    @Override
    public Iterable<Invoice> findAll() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterable<Invoice> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteById(String s) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void delete(Invoice entity) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteAll(Iterable<? extends Invoice> entities) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteAll() {
        throw new UnsupportedOperationException();
    }

    @Override
    public <S extends Invoice> Iterable<S> saveAll(Iterable<S> entities) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Optional<Invoice> findById(String number) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }
}
