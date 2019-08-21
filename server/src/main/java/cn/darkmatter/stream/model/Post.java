package cn.darkmatter.stream.model;

public class Post {
    public enum PostType {
        TEXT_WITH_9_PHOTOS;
    }

    public long id = -1;

    public PostType postType;
}
