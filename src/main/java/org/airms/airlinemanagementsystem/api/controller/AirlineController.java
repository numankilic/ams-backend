package org.airms.airlinemanagementsystem.api.controller;

import org.airms.airlinemanagementsystem.business.abstracts.AirlineService;
import org.airms.airlinemanagementsystem.core.utilities.results.DataResult;
import org.airms.airlinemanagementsystem.core.utilities.results.Result;
import org.airms.airlinemanagementsystem.entities.concretes.Airline;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/airlines")
public class AirlineController {
    AirlineService airlineService;

    @Autowired
    public AirlineController(AirlineService airlineService) {
        this.airlineService = airlineService;
    }

    @GetMapping("/getall")
    DataResult<List<Airline>> getAll() {
        return airlineService.getAll();
    }

    @GetMapping("/getByAirlineId/{id}")
    DataResult<Optional<Airline>> getById(@PathVariable(value = "id") String id) {
        return airlineService.getById(id);
    }

    @GetMapping("/getByCompanyId/{id}")
    DataResult<Optional<List<Airline>>> getByCompanyId(@PathVariable(value = "id") String companyId) {
        return this.airlineService.getByCompanyId(companyId);
    }

    @PostMapping("/add")
    Result add(@RequestBody Airline airline) {
        return this.airlineService.add(airline);
    }

    @DeleteMapping("/deleteByAirlineId")
    Result delete(@RequestParam String id) {
        return this.airlineService.deleteByAirlineId(id);
    }

    @PutMapping("/update/{id}")
    DataResult<Airline> update(@PathVariable(value = "id") String id, @RequestBody Airline airline) {
        return this.airlineService.update(id, airline);
    }

}


