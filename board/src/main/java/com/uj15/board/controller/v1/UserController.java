package com.uj15.board.controller.v1;


import com.uj15.board.dto.UserAddRequest;
import com.uj15.board.dto.UserResponse;
import com.uj15.board.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Tag(name = "1. User")
@RestController
@RequestMapping("api/v1/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {

        this.userService = userService;
    }

    @Operation(summary = "모든 회원 조회", description = "모든 회원을 조회합니다.")
    @GetMapping
    public List<UserResponse> getUsers() {

        return null;
    }

    @Operation(summary = "회원 추가", description = "회원을 추가합니다.")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addUser(@Parameter(name = "회원 요청 dto", required = true)
                        @RequestBody @Valid UserAddRequest request
    ) {

    }

    @Operation(summary = "회원 단건 조회", description = "해당하는 ID의 회원을 단건 조회합니다.")
    @GetMapping("{id}")
    public UserResponse getUserById(@Parameter(name = "조회할 회원 id") @PathVariable Long id) {

          return null;
    }

    @Operation(summary = "회원 삭제", description = "해당 ID의 회원을 삭제합니다.")
    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteUserById(@Parameter(name = "삭제할 회원 Id") @PathVariable Long id) {

    }
}
