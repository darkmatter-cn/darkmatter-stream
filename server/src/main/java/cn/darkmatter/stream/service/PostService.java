package cn.darkmatter.stream.service;

import cn.darkmatter.stream.dao.PostEntity;
import cn.darkmatter.stream.dao.PostRepository;
import cn.darkmatter.stream.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    public Post newPost(Post.PostType postType) {
        PostEntity postEntity = new PostEntity();
        postEntity.postType = postType;
        postEntity = postRepository.save(postEntity);
        Post post = new Post();
        post.id = postEntity.id;
        post.postType = postEntity.postType;
        return post;
    }

    @Autowired
    private PostRepository postRepository;
}
