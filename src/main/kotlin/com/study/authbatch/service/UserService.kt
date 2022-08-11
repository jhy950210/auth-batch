package com.study.authbatch.service

import com.study.authbatch.entity.User
import com.study.authbatch.repository.UserRepository
import lombok.RequiredArgsConstructor
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@RequiredArgsConstructor
@Transactional
class UserService(
    private val userRepository: UserRepository
) {
    fun join(user: User): User{
        return userRepository.save(user)
    }
}