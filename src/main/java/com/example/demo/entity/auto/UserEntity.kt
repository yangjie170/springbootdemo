package com.example.demo.entity.auto

import javax.persistence.*

@Entity
@Table(name = "user", schema = "shop", catalog = "")
open class UserEntity {
    @get:Id
    @get:Column(name = "uid", nullable = false)
    var uid: Int? = null
    @get:Basic
    @get:Column(name = "username", nullable = true)
    var username: String? = null
    @get:Basic
    @get:Column(name = "password", nullable = true)
    var password: Int? = null
    @get:Basic
    @get:Column(name = "name", nullable = true)
    var name: String? = null
    @get:Basic
    @get:Column(name = "telephone", nullable = true)
    var telephone: Int? = null
    @get:Basic
    @get:Column(name = "sex", nullable = true)
    var sex: String? = null
    @get:Basic
    @get:Column(name = "permisson", nullable = true)
    var permisson: String? = null


    override fun toString(): String =
            "Entity of type: ${javaClass.name} ( " +
                    "uid = $uid " +
                    "username = $username " +
                    "password = $password " +
                    "name = $name " +
                    "telephone = $telephone " +
                    "sex = $sex " +
                    "permisson = $permisson " +
                    ")"

    // constant value returned to avoid entity inequality to itself before and after it's update/merge
    override fun hashCode(): Int = 42

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as UserEntity

        if (uid != other.uid) return false
        if (username != other.username) return false
        if (password != other.password) return false
        if (name != other.name) return false
        if (telephone != other.telephone) return false
        if (sex != other.sex) return false
        if (permisson != other.permisson) return false

        return true
    }

}

