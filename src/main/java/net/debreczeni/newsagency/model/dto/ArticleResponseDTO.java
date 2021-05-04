package net.debreczeni.newsagency.model.dto;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class ArticleResponseDTO {
    @ApiModelProperty(position = 0)
    private Long id;
    @ApiModelProperty(position = 1)
    private String title;
    @ApiModelProperty(position = 2)
    private String abstractContent;

    private String author;
    private String body;
}
