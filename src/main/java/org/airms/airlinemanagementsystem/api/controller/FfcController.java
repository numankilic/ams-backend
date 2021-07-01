package org.airms.airlinemanagementsystem.api.controller;

import org.airms.airlinemanagementsystem.business.abstracts.FfcService;
import org.airms.airlinemanagementsystem.core.utilities.results.DataResult;
import org.airms.airlinemanagementsystem.entities.concretes.Ffc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/ffcustomers")
public class FfcController {
    FfcService ffcService;

    @Autowired
    public FfcController(FfcService ffcService) {
        this.ffcService = ffcService;
    }

    @GetMapping("/getall")
    DataResult<List<Ffc>> getAll() {
        return ffcService.getAll();
    }

    @GetMapping("/getByCategory/{category}")
    DataResult<Optional<List<Ffc>>> getByCategoryName(@PathVariable(value = "category") String category) {
        return this.ffcService.getByCategoryName(category);
    }
}
