package org.airms.airlinemanagementsystem.api.controller;

import org.airms.airlinemanagementsystem.business.abstracts.LegInstanceService;
import org.airms.airlinemanagementsystem.core.utilities.results.DataResult;
import org.airms.airlinemanagementsystem.entities.concretes.LegInstance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/leginstances")
public class LegInstanceController {

    LegInstanceService legInstanceService;

    public LegInstanceController(LegInstanceService legInstanceService) {
        this.legInstanceService = legInstanceService;
    }
    @GetMapping("/getall")
    public DataResult<List<LegInstance>> getAll(){
        return legInstanceService.getAll();
    }
}
