package org.airms.airlinemanagementsystem.api.controller;

import org.airms.airlinemanagementsystem.business.abstracts.AirplaneTypeService;
import org.airms.airlinemanagementsystem.core.utilities.results.DataResult;
import org.airms.airlinemanagementsystem.core.utilities.results.Result;
import org.airms.airlinemanagementsystem.entities.concretes.AirplaneType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/airplanetypes")
public class AirplaneTypeController {
    AirplaneTypeService airplaneTypeService;

    @Autowired
    public AirplaneTypeController(AirplaneTypeService airplaneTypeService) {
        this.airplaneTypeService = airplaneTypeService;
    }

    @GetMapping("/getall")
    DataResult<List<AirplaneType>> getAll() {
        return airplaneTypeService.getAll();
    }

    @GetMapping("/getById/{id}")
    DataResult<Optional<AirplaneType>> getById(@PathVariable(value = "id") String id) {
        return this.airplaneTypeService.getById(id);
    }

    @GetMapping("/getByCompanyId/{id}")
    DataResult<Optional<List<AirplaneType>>> getByCompanyId(@PathVariable(value = "id") String companyId) {
        return this.airplaneTypeService.getByCompanyId(companyId);
    }

    @GetMapping("/getByMaxSeats/{seatNumber}")
    DataResult<Optional<List<AirplaneType>>> getByMaxSeats(@PathVariable(value = "seatNumber") int seatCount) {
        return this.airplaneTypeService.getByMaxSeats(seatCount);
    }

    @PostMapping("/add")
    Result add(@RequestBody AirplaneType airplaneType) {
        return this.airplaneTypeService.add(airplaneType);
    }

    @DeleteMapping("deleteById")
    Result deleteByAirplaneId(@RequestParam(value = "id") String airplaneId){
        return this.airplaneTypeService.deleteByAirplaneId(airplaneId);
    }

    @PutMapping("update/{id}")
    Result update(@PathVariable(value = "id") String id,@RequestBody AirplaneType airplaneType){
        return this.airplaneTypeService.update(id, airplaneType);
    }
}
