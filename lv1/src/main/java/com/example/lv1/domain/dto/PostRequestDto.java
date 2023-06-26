package com.example.lv1.domain.dto;

import com.example.lv1.domain.entity.Post;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class PostRequestDto {
    private String title;
    private String content;
    private String author;
    private String password;

//    public PostRequestDto(Post post) {
//        this.title = post.getTitle();
//        this.content = post.getContent();
//        this.author = post.getAuthor();
//        this.password = post.getPassword();
//    }
}
