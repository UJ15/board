package com.uj15.board.exception;

import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.*;

public enum ErrorCode {

    USER_NOT_FOUND(NOT_FOUND, "해당 유저 정보를 찾을 수 없습니다.");

    private final HttpStatus status;
    private final String message;

    ErrorCode(HttpStatus status, String message) {

        this.status = status;
        this.message = message;
    }

    public HttpStatus getStatus() {

        return status;
    }

    public String getMessage() {

        return message;
    }
}
