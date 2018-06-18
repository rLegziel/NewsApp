package com.example.android.newsapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by roix on 6/13/18.
 */

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.container, parent, false);
        }

        News currentNews = getItem(position);


        TextView title = (TextView) listItemView.findViewById(R.id.title);
        String articleTitle = currentNews.getArticleTitle();
        title.setText(articleTitle);

        TextView section = (TextView) listItemView.findViewById(R.id.section_name);
        String sectionName = currentNews.getSectionName();
        section.setText(sectionName);

//        Date dateObject = new Date(currentNews.getDateOfPublication());
        TextView date = (TextView) listItemView.findViewById(R.id.article_date);
        String dateOfPublication = currentNews.getDateOfPublication();
        String[] onlyDate = dateOfPublication.split("T");
        date.setText(onlyDate[0]);

        return listItemView;
    }

}
