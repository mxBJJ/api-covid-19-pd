package com.maxmendes.apicovid19.repository;

import com.maxmendes.apicovid19.domain.CovidData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CovidDataRepository extends JpaRepository<CovidData, Integer> {
}
