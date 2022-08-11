package com.study.authbatch.repository

import com.study.authbatch.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long> {
}