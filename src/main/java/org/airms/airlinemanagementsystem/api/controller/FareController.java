package org.airms.airlinemanagementsystem.api.controller;

import org.airms.airlinemanagementsystem.business.abstracts.FareService;
import org.airms.airlinemanagementsystem.core.utilities.results.DataResult;
import org.airms.airlinemanagementsystem.entities.concretes.Fare;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/fares")
public class FareController {
    FareService fareService;

    @Autowired
    public FareController(FareService fareService) {
        this.fareService = fareService;
    }
    @GetMapping("/getall")
    DataResult<List<Fare>> getAll(){
        return fareService.getAll();
    }
}
