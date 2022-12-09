package com.aws.service.posts;

import com.aws.web.domain.posts.Posts;
import com.aws.web.domain.posts.PostsRepository;
import com.aws.web.dto.PostsListResponseDTO;
import com.aws.web.dto.PostsResponseDTO;
import com.aws.web.dto.PostsSaveRequestDTO;
import com.aws.web.dto.PostsUpdateRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;


@RequiredArgsConstructor
@Service
public class PostsService
{
    private final PostsRepository postsRepository;


    @Transactional
    public Long save(PostsSaveRequestDTO requestDTO)
    {
        return postsRepository.save(requestDTO.toEntity()).getId();
    }


    @Transactional
    public Long update(Long id, PostsUpdateRequestDTO requestDTO)
    {
        Posts posts = postsRepository.findById(id).orElseThrow(() ->
                new IllegalArgumentException("해당 게시글이 없습니다. id = " + id));

        posts.update(requestDTO.getTitle(), requestDTO.getContent());

        return id;
    }


    public PostsResponseDTO findById(Long id)
    {
        Posts entity = postsRepository.findById(id).orElseThrow(() ->
                new IllegalArgumentException("해당 게시글이 없습니다. id = " + id));

        return new PostsResponseDTO(entity);
    }


    @Transactional(readOnly = true)
    public List<PostsListResponseDTO> findAllDesc()
    {
        return postsRepository.findAllDesc().stream()
                .map(PostsListResponseDTO::new)
                .collect(Collectors.toList());
    }


    @Transactional
    public void delete(Long id)
    {
        Posts posts = postsRepository.findById(id).orElseThrow(() ->
                new IllegalArgumentException("해당 게시글이 없습니다. id = " + id));

        postsRepository.delete(posts);
    }
}
