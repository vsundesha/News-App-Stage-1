package com.example.anrdoid.newsappstage1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;



public class NewsAdpater extends ArrayAdapter<News> {

    public NewsAdpater(Context context, ArrayList<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                R.layout.item, parent, false);
        }

        News currentNews = getItem(position);
        TextView newsTitleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        String title = currentNews.getTitle();
        newsTitleTextView.setText(title);

        TextView categorytextView = (TextView) listItemView.findViewById(R.id.category_text_view);
        String category = currentNews.getCategory();
        categorytextView.setText(category);

        TextView datetextView = (TextView) listItemView.findViewById(R.id.date_text_view);
        String date = currentNews.getDate();
        datetextView.setText(date);

        TextView authortextView = (TextView) listItemView.findViewById(R.id.author_text_view);
        String author = currentNews.getAuthor();
        authortextView.setText(author);

        return listItemView;
    }
}
