package com.example.mvvmrestapijava.apiService;



import com.example.mvvmrestapijava.ui.main.model.ResponseCountry;

import io.reactivex.Single;
import retrofit2.http.GET;

public interface ApiService {
    @GET("countries/indonesia")
    Single<ResponseCountry> getDataCountry();
}
