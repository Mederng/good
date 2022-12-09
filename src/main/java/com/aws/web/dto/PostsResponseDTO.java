package com.aws.web.dto;

import com.aws.web.domain.posts.Posts;
import lombok.Getter;

@Getter
public class PostsResponseDTO
{
    private final Long id;
    private final String title;
    private final String content;
    private final String author;


    public PostsResponseDTO(Posts entity)
    {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }

}
