package com.zin.housingshowapi.model.repo;

import com.zin.housingshowapi.model.entity.Owner;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface OwnerRepo extends JpaRepositoryImplementation<Owner,Integer> {
}
