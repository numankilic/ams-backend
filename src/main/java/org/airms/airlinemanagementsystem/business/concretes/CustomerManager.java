package org.airms.airlinemanagementsystem.business.concretes;

import org.airms.airlinemanagementsystem.business.abstracts.CustomerService;
import org.airms.airlinemanagementsystem.core.utilities.results.DataResult;
import org.airms.airlinemanagementsystem.core.utilities.results.Result;
import org.airms.airlinemanagementsystem.core.utilities.results.SuccessDataResult;
import org.airms.airlinemanagementsystem.core.utilities.results.SuccessResult;
import org.airms.airlinemanagementsystem.dataAccess.CustomerDao;
import org.airms.airlinemanagementsystem.entities.concretes.Customer;
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
    public DataResult<List<Customer>> getAll() {
        return new SuccessDataResult<>(this.customerDao.findAll(), "Customers Listed");
    }

    @Override
    public Result add(Customer customer) {
        this.customerDao.save(customer);
        return new SuccessResult("Customer Saved");
    }

    @Override
    public DataResult<List<Customer>> getByCustomerName(String customerName) {
        return  new SuccessDataResult<>(this.customerDao.getByCustomerName(customerName), "Customer Listed By Name");
    }
}
