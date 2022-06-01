package com.uj15.board.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

@Schema(name = "화원 추가 요청 DTO", description = "email, 이름, 나이를 갖는 dto")
public class UserAddRequest {

    @Schema(example = "email")
    @NotBlank
    private final String email;

    @Schema(example = "name")
    @NotBlank
    private final String username;

    @Schema(example = "1")
    @Positive
    private final int age;

    public UserAddRequest(String email, String username, int age) {

        this.email = email;
        this.username = username;
        this.age = age;
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
