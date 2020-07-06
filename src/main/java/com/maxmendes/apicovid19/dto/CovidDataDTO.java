package com.maxmendes.apicovid19.dto;

import com.maxmendes.apicovid19.domain.CovidData;

import java.io.Serializable;

public class CovidDataDTO implements Serializable {

    private Integer id;
    private String regiao;
    private String estado;
    private Integer coduf;
    private String data;
    private Integer semanaepi;
    private String populacaoTCU2019;
    private Integer casosacumulado;
    private Integer casosnovos;
    private Integer obitosacumulado;


    public CovidDataDTO() {
    }

    public CovidDataDTO(CovidData obj) {
        this.id = id;
        this.regiao = regiao;
        this.estado = estado;
        this.coduf = coduf;
        this.data = data;
        this.semanaepi = semanaepi;
        this.populacaoTCU2019 = populacaoTCU2019;
        this.casosacumulado = casosacumulado;
        this.casosnovos = casosnovos;
        this.obitosacumulado = obitosacumulado;
    }
}

