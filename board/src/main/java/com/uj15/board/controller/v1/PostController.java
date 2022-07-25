//package com.uj15.board.controller.v1;
//
//import com.uj15.board.dto.PostAddRequest;
//import com.uj15.board.dto.PostResponse;
//import com.uj15.board.service.PostService;
//import io.swagger.v3.oas.annotations.Operation;
//import io.swagger.v3.oas.annotations.Parameter;
//import io.swagger.v3.oas.annotations.tags.Tag;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@Tag(name = "2. Post")
//@RestController
//@RequestMapping("api/v1/posts")
//public class PostController {
//
//    private final PostService postService;
//
//    public PostController(PostService postService) {
//
//        this.postService = postService;
//    }
//
//    @Operation(summary = "모든 게시물 조회", description = "모든 게시물을 조회합니다.")
//    @GetMapping
//    public List<PostResponse> getPosts() {
//
//        return null;
//    }
//
//    @Operation(summary = "게시물 생성", description = "게시물 생성 요청을 보내명 게시물을 생성합니다.")
//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public void addPost(@Parameter(name = "게시물 추가 요청 dto", required = true)
//                        @RequestBody PostAddRequest request) {
//
//    }
//
//    @Operation(summary = "게시물 단건 조회", description = "게시물 id를 받아 해당 게시물을 단건 조회합니다.")
//    @GetMapping("{id}")
//    public PostResponse getPostById()
//}
