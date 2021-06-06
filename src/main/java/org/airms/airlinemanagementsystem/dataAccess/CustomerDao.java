package org.airms.airlinemanagementsystem.dataAccess;

import org.airms.airlinemanagementsystem.entities.concrete.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDao extends JpaRepository<Customer, String> {

}
