package com.example.drishti;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;


public interface Client {
//
//    @GET("/test")
//    Call<String> Send();

    @GET("/test")
    Call<String> User();
}
