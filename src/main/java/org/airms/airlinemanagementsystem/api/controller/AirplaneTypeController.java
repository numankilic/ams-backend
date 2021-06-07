package org.airms.airlinemanagementsystem.api.controller;

import org.airms.airlinemanagementsystem.business.abstracts.AirplaneTypeService;
import org.airms.airlinemanagementsystem.entities.concretes.AirplaneType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/airplanetypes")
public class AirplaneTypeController {
    AirplaneTypeService airplaneTypeService;

    @Autowired
    public AirplaneTypeController(AirplaneTypeService airplaneTypeService) {
        this.airplaneTypeService = airplaneTypeService;
    }
    @GetMapping("/getall")
    List<AirplaneType> getAll(){
        return airplaneTypeService.getAll();
    }
}
