package com.example.lv1.service;

import com.example.lv1.domain.dto.PostRequestDto;
import com.example.lv1.domain.dto.PostResponseDto;
import com.example.lv1.domain.entity.Post;
import com.example.lv1.repository.PostRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
@Transactional
public class PostServiceTest {

    @Autowired
    PostService postService;

    @Autowired
    PostRepository postRepository;

    private Post postA;
    private Post postB;
    private Post saveA;

    @BeforeEach
    public void before() {
        postA = new Post("titleA","contentA", "authorA","passwordA");
        postB = new Post("titleB","contentB", "authorB", "passwordB");

        saveA = postRepository.save(postA);
        postRepository.save(postB);
    }
    @Test
    public void getPostsTest() throws Exception {
        //when
        List<PostResponseDto> findDtoList = postService.getPosts();

        PostResponseDto findDto = findDtoList.get(0);

        //then
        assertThat(findDtoList.size()).isEqualTo(2);
        assertThat(findDto.getModifiedAt()).isEqualTo(postA.getModifiedAt());
    }
    @Test
    public void updatePostTest() throws Exception {
        //given
        PostRequestDto postRequestDto = new PostRequestDto(new Post("titleC", "contentC", "authorC", "passwordA"));

        //when
        PostResponseDto postResponseDto = postService.updatePost(postA.getId(), postRequestDto);
        System.out.println(postA.getTitle());
        System.out.println(postA.getContent());
        System.out.println(postA.getAuthor());

        //then
        assertThat(postResponseDto.getModifiedAt()).isEqualTo(postA.getModifiedAt());
    }

    @Test
    public void deletePostTest() throws Exception {

        // given, when
        postService.deletePost(saveA.getId(), saveA.getPassword());

        //then
        assertThat(postRepository.findAllByOrderByCreatedAtDesc().size()).isEqualTo(1);
    }
}
