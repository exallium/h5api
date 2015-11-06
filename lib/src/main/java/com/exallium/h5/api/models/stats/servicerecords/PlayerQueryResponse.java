package com.exallium.h5.api.models.stats.servicerecords;


import com.fasterxml.jackson.annotation.JsonProperty;

public class PlayerQueryResponse<T> {

    /**
     * The player's gamertag.
     */
    @JsonProperty("Id")
    private String id;

    /**
     * The result of the query for the player. One of the following:
     *   Success = 0,
     *   NotFound = 1,
     *   ServiceFailure = 2,
     *   ServiceUnavailable = 3
     * It is possible for different requests from the batch to succeed and fail
     * independently.
     */
    @JsonProperty("ResultCode")
    private int resultCode;

    /**
     * The Service Record result for the player. Only set if ResultCode is Success.
     */
    @JsonProperty("Result")
    private T result;
}
