package org.airms.airlinemanagementsystem.business.abstracts;


import org.airms.airlinemanagementsystem.core.utilities.results.DataResult;
import org.airms.airlinemanagementsystem.core.utilities.results.Result;
import org.airms.airlinemanagementsystem.entities.concretes.Customer;

import java.util.List;

public interface CustomerService {
    DataResult<List<Customer>> getAll();
    Result add(Customer customer);
    DataResult<List<Customer>> getByCustomerName(String customerName);

}
