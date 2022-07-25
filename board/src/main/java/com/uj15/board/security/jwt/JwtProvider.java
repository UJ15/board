package com.uj15.board.security.jwt;

import com.uj15.board.entity.user.UserRepository;
import com.uj15.board.enums.user.UserRole;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import java.util.*;

public class JwtProvider {

    @Value("${jwt.secret}")
    private String SECRET_KEY;

    final String user = "userId";

    private final long ACCESS_EXPIRE = 1000;
    private final long REFRESH_EXPIRE = 1000;

    private final UserRepository userRepository;

    public JwtProvider(UserRepository userRepository) {

        this.userRepository = userRepository;
    }

    @PostConstruct
    public void init() {

        SECRET_KEY = Base64.getEncoder().encodeToString(SECRET_KEY.getBytes());
    }

    private Claims generateClaims(String identity, UserRole role, String name) {

        return null;
    }
}
