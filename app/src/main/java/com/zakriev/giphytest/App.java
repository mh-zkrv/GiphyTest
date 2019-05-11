package com.zakriev.giphytest;

import android.app.Application;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class App extends Application {

    private static final String GIPHY_API_BASE_URL = "https://api.giphy.com";

    private static Retrofit giphyApiRetrofit;

    public static Retrofit getGiphyApiRetrofit() {
        return giphyApiRetrofit;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        GsonConverterFactory gsonConverterFactory = GsonConverterFactory.create();
        giphyApiRetrofit = new Retrofit.Builder().baseUrl(GIPHY_API_BASE_URL)
                .addConverterFactory(gsonConverterFactory)
                .build();
    }
}
