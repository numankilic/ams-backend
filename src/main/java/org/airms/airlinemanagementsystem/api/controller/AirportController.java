package org.airms.airlinemanagementsystem.api.controller;

import org.airms.airlinemanagementsystem.business.abstracts.AirportService;
import org.airms.airlinemanagementsystem.core.utilities.results.DataResult;
import org.airms.airlinemanagementsystem.core.utilities.results.Result;
import org.airms.airlinemanagementsystem.entities.concretes.Airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/airports")
public class AirportController {
    AirportService airportService;

    @Autowired
    public AirportController(AirportService airportService) {
        this.airportService = airportService;
    }
    @GetMapping("/getall")
    DataResult<List<Airport>> getAll(){
        return airportService.getAll();
    }

    @GetMapping("/getById/{id}")
    public DataResult<Optional<Airport>> getById(@PathVariable(value = "id") String id){
        return this.airportService.getById(id);
    }
    @PostMapping("/add")
    Result add(@RequestBody Airport airport){
        return this.airportService.add(airport);
    }

    @DeleteMapping("/delete")
    Result delete(@RequestParam String id){
        return this.airportService.deleteById(id);
    }
    @PutMapping("/update")
    DataResult<Airport> update(@RequestParam String id, Airport airport){
        return this.airportService.update(id, airport);
    }
}
