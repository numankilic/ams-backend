package org.airms.airlinemanagementsystem.api.controller;

import org.airms.airlinemanagementsystem.business.abstracts.AirlineService;
import org.airms.airlinemanagementsystem.entities.concretes.Airline;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
}
