package com.zakriev.giphytest.main;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.zakriev.giphytest.data.Gif;
import com.zakriev.giphytest.main.MainRepository;

import java.util.List;

public class MainViewModel extends ViewModel {

    private MainRepository repository = new MainRepository();

    private MutableLiveData<List<Gif>> gifs = new MutableLiveData<>();
    private MutableLiveData<Boolean> scrollToTop = new MutableLiveData<>();

    private String q;


    public LiveData<List<Gif>> getGifs() {
        return gifs;
    }


    public void queryGifs(String q) {
        this.q = q;
        repository.queryGifs(q, gifs, scrollToTop);
    }

    public void loadMore() {
        repository.loadMoreGifs(q, gifs);
    }

    public LiveData<Boolean> getScrollToTop() {
        return scrollToTop;
    }

    public void rvHasBeenScrolled() {
        scrollToTop.setValue(false);
    }



}
