package com.myblog.com.myblog11.service;

import com.myblog.com.myblog11.payload.PostDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);

    PostDto getPostById(long id);

    List<PostDto> getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);
}
