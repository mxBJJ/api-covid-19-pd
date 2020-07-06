package com.maxmendes.apicovid19.service;

import com.maxmendes.apicovid19.domain.CovidData;
import com.maxmendes.apicovid19.repository.CovidDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CovidDataService {

    @Autowired
    public CovidDataRepository covidDataRepository;

    public List<CovidData> findAll(){
        List<CovidData> covidData = covidDataRepository.findAll();
        return covidData;
    }

    public Page<CovidData> findPage(Integer page, Integer linesPerPage, String orderBy, String direction){
        PageRequest pageRequest = PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction), orderBy);
        return covidDataRepository.findAll(pageRequest);
    }
}
