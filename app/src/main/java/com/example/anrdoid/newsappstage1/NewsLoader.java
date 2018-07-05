package com.example.anrdoid.newsappstage1;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

/**
 * https://content.guardianapis.com/search?api-key=06c34a0d-a943-4158-b0d3-bbf46aba3271
 */

public class NewsLoader extends AsyncTaskLoader<List<News>> {

    private static String URL =
            "http://content.guardianapis.com/search?show-tags=contributor&api-key=06c34a0d-a943-4158-b0d3-bbf46aba3271";

    public NewsLoader(Context context) {
        super(context);
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<News> loadInBackground() {
        if (URL == null) {
            return null;
        }

        List<News> newsList = QueryUtils.fetchNewsData(URL);
        return newsList;
    }
}