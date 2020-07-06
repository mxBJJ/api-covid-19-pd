package com.maxmendes.apicovid19.domain;

import javax.persistence.*;

@Entity
@Table(name = "covid_data")
public class CovidData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String regiao;
    private String estado;
    private Integer coduf;
    private String data;

    @Column(name = "semanaepi")
    private Integer semanaepi;

    private String populacaoTCU2019;

    @Column(name = "casosacumulado")
    private Integer casosacumulado;

    @Column(name = "casosnovos")
    private Integer casosnovos;

    @Column(name = "obitosacumulado")
    private Integer obitosacumulado;


    public CovidData() {
    }

    public CovidData(Integer id, String regiao, String estado, Integer coduf, String data, Integer semanaepi, String populacaoTCU2019, Integer casosacumulado, Integer casosnovos, Integer obitosacumulado) {
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


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getCoduf() {
        return coduf;
    }

    public void setCoduf(Integer coduf) {
        this.coduf = coduf;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Integer getSemanaepi() {
        return semanaepi;
    }

    public void setSemanaepi(Integer semanaepi) {
        this.semanaepi = semanaepi;
    }

    public String getPopulacaoTCU2019() {
        return populacaoTCU2019;
    }

    public void setPopulacaoTCU2019(String populacaoTCU2019) {
        this.populacaoTCU2019 = populacaoTCU2019;
    }

    public Integer getCasosacumulado() {
        return casosacumulado;
    }

    public void setCasosacumulado(Integer casosacumulado) {
        this.casosacumulado = casosacumulado;
    }

    public Integer getCasosnovos() {
        return casosnovos;
    }

    public void setCasosnovos(Integer casosnovos) {
        this.casosnovos = casosnovos;
    }

    public Integer getObitosacumulado() {
        return obitosacumulado;
    }

    public void setObitosacumulado(Integer obitosacumulado) {
        this.obitosacumulado = obitosacumulado;
    }
}
