package com.zakriev.giphytest.network;

import com.zakriev.giphytest.data.ApiResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GiphyApiService {

    String GIPHY_API_KEY = "SXoKov3OaKmGPqXjloATdf1EmFEFs8QB";

    @GET("/v1/gifs/search?&api_key=" + GIPHY_API_KEY)
    Call<ApiResponse> getApiResponse(@Query("offset") int offset, @Query("q") String q);
}
