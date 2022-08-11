package com.study.authbatch.api

import com.study.authbatch.entity.User
import com.study.authbatch.service.UserService
import lombok.RequiredArgsConstructor
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
@RequiredArgsConstructor
class UserController(private val userService: UserService) {

    @PostMapping("/join")
    fun join(@RequestBody user: User){
        userService.join(user)
    }
}