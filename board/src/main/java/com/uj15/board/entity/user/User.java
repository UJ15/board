package com.uj15.board.entity.user;

import javax.persistence.*;

import static com.google.common.base.Preconditions.checkArgument;
import static org.apache.logging.log4j.util.Strings.isNotEmpty;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "name")
    private String username;

    @Column(name = "age")
    private int age;

    protected User() {

    }

    private User(UserBuilder builder) {

        checkArgument(isNotEmpty(builder().username), "username must be provided ");
        checkArgument(isNotEmpty(builder().email), "email must be provided ");

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

    public Long getId() {

        return id;
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
