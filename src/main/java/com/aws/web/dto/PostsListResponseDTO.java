package com.aws.web.dto;

import com.aws.web.domain.posts.Posts;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostsListResponseDTO
{
    private final Long id;
    private final String title;
    private final String author;
    private final LocalDateTime modifiedDate;


    public PostsListResponseDTO(Posts entity)
    {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
        this.modifiedDate = entity.getModifiedDate();
    }
}
