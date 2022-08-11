package com.study.authbatch.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class User(name: String, age: Int) {
    @Id
    @GeneratedValue
    var id: Long? = null
    var name: String = name
        protected set

    var age: Int = age
        protected set

    fun update(name: String, age: Int) {
        this.name = name
        this.age = age
    }
}