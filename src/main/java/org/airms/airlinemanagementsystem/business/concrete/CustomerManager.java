package org.airms.airlinemanagementsystem.business.concrete;

import org.airms.airlinemanagementsystem.business.abstracts.CustomerService;
import org.airms.airlinemanagementsystem.dataAccess.CustomerDao;
import org.airms.airlinemanagementsystem.entities.concrete.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerManager implements CustomerService {

    private CustomerDao customerDao;

    @Autowired
    public CustomerManager(CustomerDao customerDao) {
        super();
        this.customerDao = customerDao;
    }

    @Override
    public List<Customer> getAll() {
        return customerDao.findAll();
    }
}
