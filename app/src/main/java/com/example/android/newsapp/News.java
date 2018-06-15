package com.example.android.newsapp;

/**
 * Created by roix on 6/7/18.
 */

public class News {

    private String mDateOfPublication;
    private String mSectionName;
    private String mArticleTitle;
    private String mUrl;

    public News(String dateOfPublication, String sectionName, String articleTitle, String url) {
        mDateOfPublication = dateOfPublication;
        mSectionName = sectionName;
        mArticleTitle = articleTitle;
        mUrl = url;
    }

    public String getDateOfPublication() {
        return mDateOfPublication;
    }

    public String getSectionName() {
        return mSectionName;
    }

    public String getArticleTitle() {
        return mArticleTitle;
    }

    public String getUrl() {
        return mUrl;
    }

}
