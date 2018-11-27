package com.adel.androidbro.cook;

import android.content.Context;
import android.util.Log;

import com.adel.androidbro.cook.data.Banner;
import com.adel.androidbro.cook.data.Category;
import com.adel.androidbro.cook.data.Recipe;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;
import com.google.gson.reflect.TypeToken;

import java.util.List;


public class ApiService {

    private Context context;

    public ApiService(Context context){
        this.context=context;
    }

    public void getRecipes(Response.Listener<List<Recipe>> listListener) {
        GsonRequest<List<Recipe>> request = new GsonRequest<>(
                Request.Method.GET,
                "https://api.myjson.com/bins/n7bxs",
                new TypeToken<List<Recipe>>() {
                }.getType(),
                listListener,
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("TAG", "onErrorResponse: ");
                    }
                }

        );

        Volley.newRequestQueue(context).add(request);
    }

    public void getBanners(Response.Listener<List<Banner>> listListener) {
        GsonRequest<List<Banner>> request = new GsonRequest<>(
                Request.Method.GET,
                "https://api.myjson.com/bins/110sw0",
                new TypeToken<List<Banner>>() {
                }.getType(),
                listListener,
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("TAG", "onErrorResponse: ");
                    }
                }

        );

        Volley.newRequestQueue(context).add(request);
    }

    public void getCategories(Response.Listener<List<Category>> categoryListener) {

        GsonRequest<List<Category>> request = new GsonRequest<>(
                Request.Method.GET,
                "https://api.myjson.com/bins/v0bog",
                new TypeToken<List<Category>>() {
                }.getType(),
                categoryListener,
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("TAG", "onErrorResponse: ");
                    }
                }

        );

        Volley.newRequestQueue(context).add(request);
    }
}
