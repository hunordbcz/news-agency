package net.debreczeni.newsagency.service;

import net.debreczeni.newsagency.model.Article;
import net.debreczeni.newsagency.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {
    @Autowired
    ArticleRepository repository;

    public List<Article> findAll(){
        return repository.findAll();
    }
}
