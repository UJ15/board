package com.uj15.board.entity.post;

import com.uj15.board.entity.user.User;
import org.springframework.util.Assert;

import javax.persistence.*;

@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    protected Post() {

    }

    private Post(PostBuilder builder) {

        Assert.notNull(builder.title, "title must be provided");
        Assert.notNull(builder.content, "content must be provided");
        Assert.notNull(builder.user, "user must be provided");

        this.title = builder.title;
        this.content = builder.content;
        this.user = builder.user;
    }

    public static class PostBuilder {

        private String title;
        private String content;
        private User user;

        public PostBuilder title(String title) {

            this.title = title;
            return this;
        }

        public PostBuilder content(String content) {

            this.content = content;
            return this;
        }

        public PostBuilder user(User user) {

            this.user = user;
            return this;
        }

        public Post build() {

            return new Post(this);
        }
    }

    public static PostBuilder builder() {

        return new PostBuilder();
    }

    public Long getId() {

        return id;
    }

    public String getTitle() {

        return title;
    }

    public String getContent() {

        return content;
    }

    public User getUser() {

        return user;
    }
}
