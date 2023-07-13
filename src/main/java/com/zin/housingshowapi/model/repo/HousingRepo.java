package com.zin.housingshowapi.model.repo;

import com.zin.housingshowapi.model.entity.Housing;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface HousingRepo extends JpaRepositoryImplementation<Housing,Integer> {
}
