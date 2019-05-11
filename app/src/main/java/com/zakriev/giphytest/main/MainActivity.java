package com.zakriev.giphytest.main;


import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.Menu;

import com.zakriev.giphytest.ui.GifsAdapter;
import com.zakriev.giphytest.R;
import com.zakriev.giphytest.data.Gif;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private boolean loading = false;
    private MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.rv);

        final LinearLayoutManager layoutManager =
                new LinearLayoutManager(this);

        final GifsAdapter adapter = new GifsAdapter();

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        viewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        viewModel.getGifs().observe(this, new Observer<List<Gif>>() {
            @Override
            public void onChanged(@Nullable List<Gif> gifs) {
                adapter.updateGifs(gifs);
                loading = false;
            }
        });


        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                //check for scroll down
                if(dy > 0) {
                    int totalItemCount = layoutManager.getItemCount();
                    int lastVisibleItem = layoutManager.findLastVisibleItemPosition();
                    if (!loading && lastVisibleItem > totalItemCount - 5) {
                        viewModel.loadMore();
                        loading = true;
                    }
                }
            }
        });




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        SearchView searchView = (SearchView) menu.getItem(0).getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
                public boolean onQueryTextSubmit(String s) {
                viewModel.queryGifs(s);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                return false;
            }
        });
        return super.onPrepareOptionsMenu(menu);
    }

}
