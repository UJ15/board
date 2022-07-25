package com.uj15.board.dto;

import com.uj15.board.entity.user.User;

public class UserResponse {

    private final Long Id;
    private final String username;
    private final String email;
    private final int age;

    private UserResponse(UserResponseBuilder builder) {

        this.Id = builder.id;
        this.username = builder.username;
        this.email = builder.email;
        this.age = builder.age;
    }

    public static UserResponse from(User user) {

        return UserResponse.builder()
                .id(user.getUserId())
                .username(user.getUsername())
                .email(user.getEmail())
                .age(user.getAge())
                .build();
    }

    public static class UserResponseBuilder {

        private Long id;
        private String username;
        private String email;
        private int age;

        public UserResponseBuilder id(Long id) {

            this.id = id;
            return this;
        }

        public UserResponseBuilder username(String username) {

            this.username = username;
            return this;
        }

        public UserResponseBuilder email(String email) {

            this.email = email;
            return this;
        }

        public UserResponseBuilder age(int age) {

            this.age = age;
            return this;
        }

        public UserResponse build() {

            return new UserResponse(this);
        }
    }

    public static UserResponseBuilder builder() {

        return new UserResponseBuilder();
    }


    public Long getId() {

        return Id;
    }

    public String getUsername() {

        return username;
    }

    public String getEmail() {

        return email;
    }

    public int getAge() {

        return age;
    }
}
