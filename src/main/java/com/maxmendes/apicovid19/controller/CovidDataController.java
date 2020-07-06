package com.maxmendes.apicovid19.controller;

import com.maxmendes.apicovid19.domain.CovidData;
import com.maxmendes.apicovid19.repository.CovidDataRepository;
import com.maxmendes.apicovid19.service.CovidDataService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Api(value="API Rest Covid-19")
@RestController
@RequestMapping(value ="/covidinfo")
public class CovidDataController {

    @Autowired
    private CovidDataService covidDataService;

    @Autowired
    private CovidDataRepository covidDataRepository;

    @ApiOperation(value="O método getCovidInformations da Controller, retorna uma lista paginada de até" +
            " 20 objetos, com informações por região, dos casos de COVID-19 no Brasil. Dados obtidos" +
            " a partir do arquivo CSV disponibilizado em https://covid.saude.gov.br/")
    @RequestMapping(value = "/cases", method = RequestMethod.GET)
    public List<CovidData> getCovidInformations(
            @RequestParam(value = "page", defaultValue = "0") Integer page,
            @RequestParam(value = "linesPerPage", defaultValue = "24") Integer linesPerPage,
            @RequestParam(value = "orderBy", defaultValue = "id") String orderBy,
            @RequestParam(value = "direction", defaultValue = "ASC") String direction){

            Page<CovidData> list = covidDataService.findPage(page,linesPerPage,orderBy,direction);

            List<CovidData> pagedList = list.getContent();

            return pagedList;

    }

    @ApiOperation(value = "O método getById da Controller, retorna um caso " +
            "com informações por região, dos casos de COVID-19 no Brasil. Dados obtidos" +
            " a partir do arquivo CSV disponibilizado em https://covid.saude.gov.br/")
    @GetMapping(value = "/{id}")
    public CovidData getById(@PathVariable Integer id){

        Optional<CovidData> data = covidDataRepository.findById(id);

        return data.orElse(null);
    }
}
