package org.airms.airlinemanagementsystem.api.controller;

import org.airms.airlinemanagementsystem.business.abstracts.FlightLegService;
import org.airms.airlinemanagementsystem.entities.concretes.FlightLeg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/flightlegs")
public class FlightLegController {
    FlightLegService flightLegService;

    @Autowired
    public FlightLegController(FlightLegService flightLegService) {
        this.flightLegService = flightLegService;
    }
    @GetMapping("/gelall")
    public List<FlightLeg> getAll(){
        return this.flightLegService.getAll();
    }
}
