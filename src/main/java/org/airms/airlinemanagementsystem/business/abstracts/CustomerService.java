package org.airms.airlinemanagementsystem.business.abstracts;


import org.airms.airlinemanagementsystem.entities.concretes.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getAll();
}
