package org.airms.airlinemanagementsystem.business.abstracts;

import org.airms.airlinemanagementsystem.entities.concretes.Company;

import java.util.List;

public interface CompanyService {
    List<Company> getAll();
}
