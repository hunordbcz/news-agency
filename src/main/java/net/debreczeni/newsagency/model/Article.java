package net.debreczeni.newsagency.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String abstractContent;
    private String author;
    private String body;

    @ManyToMany
    private List<Article> related;
}
