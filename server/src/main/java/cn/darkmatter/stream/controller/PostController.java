package cn.darkmatter.stream.controller;

import cn.darkmatter.stream.dao.PostEntity;
import cn.darkmatter.stream.model.Post;
import cn.darkmatter.stream.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
public class PostController {

    @RequestMapping(method = RequestMethod.POST, value = "/new")
    public Post newPost(
        @RequestParam("post_type") final Post.PostType postType
    ) {
        return postService.newPost(postType);
    }

    @Autowired
    private PostService postService;

}
