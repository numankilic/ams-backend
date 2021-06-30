package org.airms.airlinemanagementsystem.api.controller;

import org.airms.airlinemanagementsystem.business.abstracts.AirplaneService;
import org.airms.airlinemanagementsystem.core.utilities.results.DataResult;
import org.airms.airlinemanagementsystem.core.utilities.results.Result;
import org.airms.airlinemanagementsystem.entities.concretes.Airplane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/airplanes")
public class AirplaneController {
    AirplaneService airplaneService;

    @Autowired
    public AirplaneController(AirplaneService airplaneService) {
        this.airplaneService = airplaneService;
    }

    @GetMapping("/getall")
    DataResult<List<Airplane>> getAll() {
        return airplaneService.getAll();
    }

    @GetMapping("/getByAirplaneId")
    DataResult<Optional<Airplane>> getById(@RequestParam String id) {
        return this.airplaneService.getById(id);
    }

    @GetMapping("/getByCompanyId")
    DataResult<Optional<List<Airplane>>> getByCompanyId(@RequestParam String companyId) {
        return this.airplaneService.getByCompanyId(companyId);
    }

    @GetMapping("/getByAirplaneType")
    DataResult<Optional<List<Airplane>>> getByAirplaneType(@RequestParam String airplaneTypeName) {
        return this.airplaneService.getByAirplaneType(airplaneTypeName);
    }

    @PostMapping("/add")
    Result add(@RequestBody Airplane airplane){
        return this.airplaneService.add(airplane);
    }

    @DeleteMapping("deleteByAirplaneId")
    Result delete(@RequestParam String id){
        return this.airplaneService.deleteByAirplaneId(id);
    }
}
