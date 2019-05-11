package com.zakriev.giphytest.ui;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.zakriev.giphytest.R;
import com.zakriev.giphytest.data.Gif;
import com.zakriev.giphytest.data.Original;
import com.zakriev.giphytest.data.PreviewGif;

import java.util.List;

public class GifsAdapter extends RecyclerView.Adapter<GifsAdapter.ViewHolder> {

    private List<Gif> gifs;
    private int fullWidth;

    @NonNull
    @Override
    public GifsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ImageView iv = (ImageView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_gif,
                viewGroup, false);

        fullWidth = viewGroup.getWidth();

        return new ViewHolder(iv);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        ImageView iv = viewHolder.iv;

        PreviewGif img = gifs.get(i).getImages().getPreviewGif();
        double width = Double.parseDouble(img.getWidth());
        double height = Double.parseDouble(img.getHeight());

        double coeff = fullWidth / width;

        iv.setMinimumHeight((int) (coeff * height) + 10);

        Glide.with(iv.getContext())
                .load(gifs.get(i).getImages().getPreviewGif().getUrl())
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(iv);
    }

    @Override
    public int getItemCount() {
        if (gifs == null)
            return 0;
        return gifs.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView iv;

        public ViewHolder(ImageView iv) {
            super(iv);
            this.iv = iv;
        }
    }

    public void updateGifs(List<Gif> gifs) {
        this.gifs = gifs;
        notifyDataSetChanged();
    }
}
