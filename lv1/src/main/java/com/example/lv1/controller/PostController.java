package com.example.lv1.controller;

import com.example.lv1.domain.dto.PostRequestDto;
import com.example.lv1.domain.dto.PostResponseDto;
import com.example.lv1.domain.entity.Post;
import com.example.lv1.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @GetMapping("/posts")
    public List<PostResponseDto> getPosts() {
        return postService.getPosts();
    }

    @GetMapping("/post/{id}")
    public PostResponseDto getPostById(@PathVariable Long id) {
        return postService.findPostResponse(id);
    }

    @PostMapping("/post")
    public PostResponseDto createPost(@RequestBody PostRequestDto requestDto) {
        return postService.createPost(requestDto);
    }

    @PutMapping("/post/{id}")
    public PostResponseDto updatePost(@PathVariable Long id, @RequestBody PostRequestDto requestDto) {
        return postService.updatePost(id, requestDto);
    }

    @DeleteMapping("/post/{id}")
    public @ResponseBody Map<String, Boolean> deletePost(@PathVariable Long id, @RequestBody Map<String, String > password) {
        Map<String, Boolean> deleteResponse = new HashMap<>();
        deleteResponse.put("success", postService.deletePost(id, password.get("password")));
        return deleteResponse;
    }
}
