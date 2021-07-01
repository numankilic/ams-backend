package org.airms.airlinemanagementsystem.dataAccess;

import org.airms.airlinemanagementsystem.core.utilities.results.DataResult;
import org.airms.airlinemanagementsystem.entities.concretes.Ffc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface FfcDao extends JpaRepository<Ffc, String> {
    @Query("from Ffc where category=:categoryName")
    Optional<List<Ffc>> getByCategory(String categoryName);
}
