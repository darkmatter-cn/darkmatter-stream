package cn.darkmatter.stream.dao;

import cn.darkmatter.stream.model.Post;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PostEntity {
    public PostEntity() {
        this.id = null;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    public final Long id;

    public Post.PostType postType;
}
