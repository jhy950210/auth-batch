package com.study.authbatch.service

import com.study.authbatch.entity.User
import com.study.authbatch.repository.UserRepository
import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith


@ExtendWith(MockKExtension::class)
internal class UserServiceTest{
    @MockK
    private lateinit var userService: UserService
    @MockK
    private lateinit var userRepository: UserRepository

    @BeforeEach
    fun setUp(){
        userService = UserService(userRepository)
    }

    @Test
    fun `회원가입`(){
        // given
        val testUser = User(name = "test1", age = 12)
        every { userRepository.save(testUser) } returns testUser

        // when
        val saveUser = userService.join(testUser)

        // then
        assertEquals(testUser,saveUser)
    }
}