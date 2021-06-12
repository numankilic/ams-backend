package org.airms.airlinemanagementsystem.api.controller;

import org.airms.airlinemanagementsystem.business.abstracts.AirlineService;
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
    List<Airline> getAll(){
        return airlineService.getAll();
    }

    @GetMapping("/{id}")
    @ResponseBody
    Optional<Airline> getById(@PathVariable String id){
        return airlineService.getById(id);
    }

//    @GetMapping("/getflights/{id}")
//    @ResponseBody
//    List<Flight> getFlights(@PathVariable String id){
//        return airlineService.getById(id).getFlights();
//    }
}
