package io.asquare.anina.domain.user.controller;

import io.asquare.anina.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@Slf4j
@RequestMapping("/api")
@RestController
@RequiredArgsConstructor
public class userController {


    private final UserService userService;

    /*    @PostMapping("/login")
        public ResponseEntity<?> login (@RequestBody UserInfo userInfo) {
            return ResponseEntity.ok(userService.existUser(userInfo));
        }*/
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, Object> resultMap) {
        return ResponseEntity.ok(userService.existUser(resultMap));
    }
}
