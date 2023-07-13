package com.zin.housingshowapi.api;

import com.zin.housingshowapi.model.service.OwnerService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OwnerController {

    private final OwnerService service;

    public OwnerController(OwnerService service) {
        this.service = service;
    }
}
