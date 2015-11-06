package com.exallium.h5.api.models.stats.servicerecords;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties({"Links"})
public class ServiceRecordCollection<T> {

    @JsonProperty("Results")
    private List<PlayerQueryResponse<T>> results;

    public List<PlayerQueryResponse<T>> getResults() {
        return results;
    }
}
