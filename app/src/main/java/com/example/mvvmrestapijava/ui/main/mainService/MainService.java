package com.example.mvvmrestapijava.ui.main.mainService;



import com.example.mvvmrestapijava.apiService.ApiService;
import com.example.mvvmrestapijava.ui.main.model.ResponseCountry;

import javax.inject.Inject;

import io.reactivex.Single;

public class MainService {
    ApiService apiService;

    @Inject
    public MainService(ApiService apiService) {
        this.apiService = apiService;
    }

    public Single<ResponseCountry> getData() {
        return apiService.getDataCountry();
    }
}
