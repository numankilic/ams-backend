package org.airms.airlinemanagementsystem.dataAccess;

import org.airms.airlinemanagementsystem.entities.concretes.Airplane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface AirplaneDao extends JpaRepository<Airplane, String> {
    @Query("from Airplane where companyId=:companyId")
    Optional<List<Airplane>> getByCompanyId(String companyId);

    @Query("from Airplane where airplaneTypeName=:airplaneTypeName")
    Optional<List<Airplane>> getByAirplaneType(String airplaneTypeName);
}
