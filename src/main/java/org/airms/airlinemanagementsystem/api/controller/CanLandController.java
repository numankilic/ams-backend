package org.airms.airlinemanagementsystem.api.controller;

import org.airms.airlinemanagementsystem.business.abstracts.CanLandService;
import org.airms.airlinemanagementsystem.core.utilities.results.DataResult;
import org.airms.airlinemanagementsystem.entities.concretes.CanLand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/canlands")
public class CanLandController {
    CanLandService canLandService;

    @Autowired
    public CanLandController(CanLandService canLandService) {
        this.canLandService = canLandService;
    }
    @GetMapping("/getall")
    DataResult<List<CanLand>> getAll(){
        return canLandService.getAll();
    }
}
