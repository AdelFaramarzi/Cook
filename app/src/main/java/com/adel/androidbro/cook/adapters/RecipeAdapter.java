package com.adel.androidbro.cook.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.adel.androidbro.cook.R;
import com.adel.androidbro.cook.data.Recipe;
import com.squareup.picasso.Picasso;
import java.util.List;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder> {

    private List<Recipe> recipes;

    public RecipeAdapter(List<Recipe> recipes) {

        this.recipes = recipes;
    }

    @NonNull
    @Override
    public RecipeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new RecipeViewHolder(LayoutInflater.from(parent.getContext()).inflate(
                R.layout.item_recipe, parent, false
        ));
    }

    @Override
    public void onBindViewHolder(@NonNull RecipeViewHolder holder, int position) {
        holder.bindRecipe(recipes.get(position));
    }

    @Override
    public int getItemCount() {
        return recipes.size();
    }

    public class RecipeViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView titleTv;
        private TextView descriptionTv;
        private TextView authorTv;
        private RatingBar ratingBar;

        public RecipeViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.iv_recipe);
            titleTv = itemView.findViewById(R.id.tv_recipe_title);
            descriptionTv = itemView.findViewById(R.id.tv_recipe_desc);
            authorTv = itemView.findViewById(R.id.tv_recipe_author);
            ratingBar = itemView.findViewById(R.id.ratingBar_recipe);
        }

        public void bindRecipe(Recipe recipe) {
            Picasso.get().load(recipe.getImg()).into(imageView);
            titleTv.setText(recipe.getTitle());
            descriptionTv.setText(recipe.getDesc());
            authorTv.setText("By " + recipe.getBy());
            ratingBar.setRating(recipe.getRate());
        }
    }
}
