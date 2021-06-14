package org.airms.airlinemanagementsystem.dataAccess;

import org.airms.airlinemanagementsystem.entities.concretes.Airline;
import org.airms.airlinemanagementsystem.entities.concretes.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface AirlineDao extends JpaRepository<Airline, String> {
    @Query("from Airline where companyId=:companyId")
    Optional<List<Airline>> getByCompanyId(String companyId);


}
