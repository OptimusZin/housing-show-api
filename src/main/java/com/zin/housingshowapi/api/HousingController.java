package com.zin.housingshowapi.api;

import com.zin.housingshowapi.model.service.HousingService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HousingController {

    private final HousingService service;

    public HousingController(HousingService service) {
        this.service = service;
    }
}
