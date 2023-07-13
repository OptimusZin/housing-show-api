package com.zin.housingshowapi.model.service;

import com.zin.housingshowapi.model.repo.OwnerRepo;
import org.springframework.stereotype.Service;

@Service
public class OwnerService {

    private final OwnerRepo repo;

    public OwnerService(OwnerRepo repo) {
        this.repo = repo;
    }
}
