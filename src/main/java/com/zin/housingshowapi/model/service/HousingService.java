package com.zin.housingshowapi.model.service;

import com.zin.housingshowapi.model.repo.HousingRepo;
import org.springframework.stereotype.Service;

@Service
public class HousingService {

    private final HousingRepo repo;

    public HousingService(HousingRepo repo) {
        this.repo = repo;
    }
}
