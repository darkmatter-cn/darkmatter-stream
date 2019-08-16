package cn.darkmatter.stream.service;

import cn.darkmatter.stream.dao.PostEntity;
import cn.darkmatter.stream.dao.PostRepository;
import cn.darkmatter.stream.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    public Post newPost() {
        PostEntity postEntity = new PostEntity();
        postEntity = postRepository.save(postEntity);
        Post post = new Post();
        post.id = postEntity.id;
        return post;
    }

    @Autowired
    private PostRepository postRepository;
}
