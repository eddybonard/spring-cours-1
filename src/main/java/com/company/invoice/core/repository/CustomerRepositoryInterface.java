package com.company.invoice.core.repository;

import com.company.invoice.core.entity.Customer;
import com.company.invoice.core.entity.Invoice;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepositoryInterface extends CrudRepository<Customer, Long> {
//    Invoice create(Invoice invoice);
//
//    List<Invoice> list();
//
//    Invoice findById(String number);
}
