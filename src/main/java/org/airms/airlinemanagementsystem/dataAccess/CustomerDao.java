package org.airms.airlinemanagementsystem.dataAccess;

import org.airms.airlinemanagementsystem.entities.concretes.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerDao extends JpaRepository<Customer, String> {
    @Query("From Customer where customerName=:customerName")
    List<Customer> getByCustomerName(String customerName);
}
