package com.uj15.board.entity.user;

import org.springframework.util.Assert;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    @Column(name = "email")
    private String email;

    @Column(name = "name")
    private String username;

    @Column(name = "age")
    private int age;

    protected User() {

    }

    private User(UserBuilder builder) {

        Assert.notNull(builder.username, "username must be provided ");
        Assert.notNull(builder.email, "email must be provided ");
        Assert.state(builder.age <= 0, "age must be positive");

        this.email = builder.email;
        this.username = builder.username;
        this.age = builder.age;
    }

    public static class UserBuilder {

        private String email;
        private String username;
        private int age;

        public UserBuilder email(String email) {

            this.email = email;
            return this;
        }

        public UserBuilder username(String username) {

            this.username = username;
            return this;
        }

        public UserBuilder age(int age) {

            this.age = age;
            return this;
        }

        public User build() {

            return new User(this);
        }
    }

    public static UserBuilder builder() {

        return new UserBuilder();
    }

    public Long getUserId() {

        return userId;
    }

    public String getEmail() {

        return email;
    }

    public String getUsername() {

        return username;
    }

    public int getAge() {

        return age;
    }
}
