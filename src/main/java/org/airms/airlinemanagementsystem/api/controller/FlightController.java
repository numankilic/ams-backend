package org.airms.airlinemanagementsystem.api.controller;

import org.airms.airlinemanagementsystem.business.abstracts.FlightService;
import org.airms.airlinemanagementsystem.entities.concretes.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/flights")
public class FlightController {

    FlightService flightService;

    @Autowired
    public FlightController(FlightService flightService) {
        super();
        this.flightService = flightService;
    }
    @GetMapping("/getall")
    List<Flight> getAll(){
        return flightService.getAll();
    }
}
