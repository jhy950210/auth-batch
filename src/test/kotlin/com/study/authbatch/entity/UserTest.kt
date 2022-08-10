package com.study.authbatch.entity

import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(MockKExtension::class)
class UserTest{
    @MockK
    private lateinit var user: User

    @Test
    fun `user test`(){

    }
}