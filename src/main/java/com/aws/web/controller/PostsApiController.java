package com.aws.web.controller;

import com.aws.service.posts.PostsService;
import com.aws.web.dto.PostsResponseDTO;
import com.aws.web.dto.PostsSaveRequestDTO;
import com.aws.web.dto.PostsUpdateRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController
{
    private final PostsService postsService;


    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDTO requestDTO)
    {
        return postsService.save(requestDTO);
    }


    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDTO requestDTO)
    {
        return postsService.update(id, requestDTO);
    }


    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDTO findById(@PathVariable Long id)
    {
        return postsService.findById(id);
    }


    @DeleteMapping("/api/v1/posts/{id}")
    public Long delete(@PathVariable Long id)
    {
        postsService.delete(id);

        return id;
    }
}
