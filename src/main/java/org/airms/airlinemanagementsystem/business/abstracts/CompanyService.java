package org.airms.airlinemanagementsystem.business.abstracts;

import org.airms.airlinemanagementsystem.core.utilities.results.DataResult;
import org.airms.airlinemanagementsystem.entities.concretes.Company;

import java.util.List;

public interface CompanyService {
    DataResult<List<Company>> getAll();
}
