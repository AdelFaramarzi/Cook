package com.adel.androidbro.cook.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.adel.androidbro.cook.R;
import com.adel.androidbro.cook.data.Banner;
import com.squareup.picasso.Picasso;

import java.util.List;

public class BannerAdapter extends RecyclerView.Adapter<BannerAdapter.BannerViewHolder> {
    private List<Banner> banners;

    public BannerAdapter(List<Banner> banners) {

        this.banners = banners;
    }

    @NonNull
    @Override
    public BannerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new BannerViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_banner,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull BannerViewHolder holder, int position) {
        holder.bindBanner(banners.get(position));
    }

    @Override
    public int getItemCount() {
        return banners.size();
    }

    public class BannerViewHolder extends RecyclerView.ViewHolder {
        private ImageView bannerImageView;

        public BannerViewHolder(View itemView) {
            super(itemView);
            bannerImageView = (ImageView) itemView;
        }

        public void bindBanner(Banner banner) {
            Picasso.get().load(banner.getImg()).into(bannerImageView);
        }
    }
}
