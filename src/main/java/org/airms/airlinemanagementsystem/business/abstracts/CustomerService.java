package org.airms.airlinemanagementsystem.business.abstracts;


import org.airms.airlinemanagementsystem.entities.concrete.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getAll();
}
