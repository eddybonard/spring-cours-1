package com.company.invoice.core.repository.database;
//
//import com.company.invoice.core.entity.Invoice;
//import com.company.invoice.core.repository.InvoiceRepositoryInterface;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.support.GeneratedKeyHolder;
//import org.springframework.jdbc.support.KeyHolder;
//import org.springframework.stereotype.Repository;
//
//import java.sql.PreparedStatement;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.List;
//
//@Repository
//public class InvoiceDataBaseRepository implements InvoiceRepositoryInterface {
//
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
//    public Invoice create(Invoice invoice){
//        KeyHolder keyHolder = new GeneratedKeyHolder();
//        jdbcTemplate.update(connection -> {
//            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO INVOICE(CUSTOMER_NAME, ORDER_NUMBER) VALUE(?,?)", Statement.RETURN_GENERATED_KEYS);
//            preparedStatement.setString(1, invoice.getCustomerName());
//            preparedStatement.setString(2, invoice.getOrderNumber());
//
//            return preparedStatement;
//        }, keyHolder);
//
//        invoice.setNumber(keyHolder.getKey().toString());
//
//        return invoice;
//    }
//
//    @Override
//    public List<Invoice> list() {
//        return jdbcTemplate.query("SELECT INVOICE_NUMBER, CUSTOMER_NAME FROM INVOICE", (rs, rowNum) -> new Invoice(String.valueOf(rs.getLong("INVOICE_NUMBER")), rs.getString("CUSTOMER_NAME")));
//    }
//
//    @Override
//    public Invoice findById(String number) {
//        return jdbcTemplate.queryForObject("SELECT INVOICE_NUMBER, CUSTOMER_NAME, ORDER_NUMBER FROM INVOICE WHERE INVOICE_NUMBER=?", new Object[]{number}, (rs, rowNum) -> new Invoice(String.valueOf(rs.getLong("INVOICE_NUMBER")), rs.getString("CUSTOMER_NAME"), rs.getString("ORDER_NUMBER")));
//    }
//}
