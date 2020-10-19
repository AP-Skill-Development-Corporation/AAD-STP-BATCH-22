package com.apssdc.covid19api;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Covid19Interface {
    @GET("dayone/country/in")
    Call<String> getData();
}
