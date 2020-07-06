package com.maxmendes.apicovid19.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ContentDTO implements Serializable {

    private List<CovidDataDTO> content = new ArrayList<>();

    public ContentDTO() {
    }

    public ContentDTO(List<CovidDataDTO> content) {
        this.content = content;
    }

    public List<CovidDataDTO> getContent() {
        return content;
    }

    public void setContent(List<CovidDataDTO> content) {
        this.content = content;
    }
}
