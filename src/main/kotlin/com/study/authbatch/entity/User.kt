package com.study.authbatch.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class User(
    @Id
    @GeneratedValue
    val id: Long,
    var name: String,
    var age: Int
) {
    fun update(name: String, age: Int){
        this.name = name
        this.age = age
    }
}