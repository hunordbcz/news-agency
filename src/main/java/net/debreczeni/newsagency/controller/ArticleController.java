package net.debreczeni.newsagency.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import net.debreczeni.newsagency.model.dto.ArticleResponseDTO;
import net.debreczeni.newsagency.service.ArticleService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/articles")
@Api(tags = "articles")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    private final ModelMapper modelMapper;

    public ArticleController(){
        modelMapper = new ModelMapper();
    }

    @GetMapping("/getAll")
    @ApiResponses(value = {//
            @ApiResponse(code = 400, message = "Something went wrong"), //
            @ApiResponse(code = 403, message = "Access denied"), //
            @ApiResponse(code = 422, message = "Username is already in use")})
    public List<Object> getAll() {
        return articleService.findAll().stream().map(obj -> modelMapper.map(obj, ArticleResponseDTO.class)).collect(Collectors.toList());
    }
}
