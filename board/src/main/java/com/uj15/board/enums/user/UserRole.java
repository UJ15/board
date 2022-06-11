package com.uj15.board.enums.user;

import com.uj15.board.exception.ErrorCode;
import org.webjars.NotFoundException;

import java.util.Arrays;

public enum UserRole {

    USER("일반 사용자"),
    ADMIN("관리자");

    private String userRole;
    UserRole(String userRole) {

        this.userRole = userRole;
    }

    public static UserRole from(String role) {

        return Arrays.stream(UserRole.values())
                .filter(userRole -> userRole.toString().equalsIgnoreCase(role))
                .findAny().orElseThrow(() -> new NotFoundException(ErrorCode.USER_NOT_FOUND.getMessage()));
    }

    public String getUserRole() {

        return userRole;
    }
}
