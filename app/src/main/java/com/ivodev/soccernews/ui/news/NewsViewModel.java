package com.ivodev.soccernews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.ivodev.soccernews.domain.News;

import java.util.ArrayList;
import java.util.List;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;


    public NewsViewModel() {
        this.news = new MutableLiveData<>();

        //TODO Remover Mock de noticias
        List<News> news = new ArrayList<>();
        news.add(new News("Pameiras é Campeão", "Palmeiras conquista o titulo novamente"));
        news.add(new News("Pameiras vence o São Paulo", "Palmeiras conquista o titulo novamente"));
        news.add(new News("Pameiras joga neste domingo", "Palmeiras conquista o titulo novamente"));
        this.news.setValue(news);
    }

    public LiveData<List<News>> getNews() {
        return this.news;
    }
}