package com.zakriev.giphytest.main;

import android.arch.lifecycle.MutableLiveData;
import android.util.Log;

import com.zakriev.giphytest.App;
import com.zakriev.giphytest.network.GiphyApiService;
import com.zakriev.giphytest.data.ApiResponse;
import com.zakriev.giphytest.data.Gif;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.internal.EverythingIsNonNull;

public class MainRepository {
    private GiphyApiService giphyApiService = App.getGiphyApiRetrofit().create(GiphyApiService.class);


    public void queryGifs(String q, final MutableLiveData<List<Gif>> gifsLiveData,
                          final MutableLiveData<Boolean> scrollToTop) {
        giphyApiService.getApiResponse(0, q).enqueue(new Callback<ApiResponse>() {
            @Override
            @EverythingIsNonNull
            public void onResponse(Call<ApiResponse> call, Response<ApiResponse> response) {
                ApiResponse responseBody = response.body();
                if (responseBody != null) {
                    gifsLiveData.setValue(responseBody.getData());
                    scrollToTop.setValue(true);
                }
            }

            @Override
            @EverythingIsNonNull
            public void onFailure(Call<ApiResponse> call, Throwable t) {

            }
        });
    }

    public void loadMoreGifs(String q, final MutableLiveData<List<Gif>> gifsLiveData) {

        final ArrayList<Gif> gifs;

        if (gifsLiveData.getValue() == null) {
            gifs = new ArrayList<>();
        } else {
            gifs = (ArrayList<Gif>) gifsLiveData.getValue();
        }
        Log.d("jsjsjs", gifs.size() + "");

        giphyApiService.getApiResponse(gifs.size(), q).enqueue(new Callback<ApiResponse>() {
            @Override
            @EverythingIsNonNull
            public void onResponse(Call<ApiResponse> call, Response<ApiResponse> response) {
                ApiResponse responseBody = response.body();
                if (responseBody != null) {
                    List<Gif> responseGifs = responseBody.getData();
                    gifs.addAll(responseGifs);
                    gifsLiveData.setValue(gifs);
                    Log.d("jsjsjs", gifs.size() + "");
                }
            }

            @Override
            @EverythingIsNonNull
            public void onFailure(Call<ApiResponse> call, Throwable t) {

            }
        });
    }
}
