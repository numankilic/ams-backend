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

    @GetMapping("/getByAirlineId")
    DataResult<Optional<Airline>> getById(@RequestParam String id) {
        return airlineService.getById(id);
    }

    @GetMapping("/getByCompanyId")
    DataResult<Optional<List<Airline>>> getByCompanyId(@RequestParam String companyId) {
        return this.airlineService.getByCompanyId(companyId);
    }

    @PostMapping("/add")
    public Result add(@RequestBody Airline airline){
        return this.airlineService.add(airline);
    }

    @DeleteMapping("/deleteByAirlineId")
    public void delete(@RequestParam String id){
        this.airlineService.deleteByAirlineId(id);
    }

}


