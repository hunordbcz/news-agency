package net.debreczeni.newsagency.model.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ArticleDataDTO {

    @ApiModelProperty(position = 0)
    private String title;
    @ApiModelProperty(position = 1)
    private String abstractContent;
    @ApiModelProperty(position = 2)
    private String author;
    @ApiModelProperty(position = 3)
    private String body;
    @ApiModelProperty(position = 4)
    private String relatedArticles;
}
