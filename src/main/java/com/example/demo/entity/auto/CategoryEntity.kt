package com.example.demo.entity.auto

import javax.persistence.*

@Entity
@Table(name = "category", schema = "shop", catalog = "")
open class CategoryEntity {
    @get:Id
    @get:Column(name = "cid", nullable = false)
    var cid: String? = null
    @get:Basic
    @get:Column(name = "cname", nullable = true)
    var cname: String? = null


    override fun toString(): String =
            "Entity of type: ${javaClass.name} ( " +
                    "cid = $cid " +
                    "cname = $cname " +
                    ")"

    // constant value returned to avoid entity inequality to itself before and after it's update/merge
    override fun hashCode(): Int = 42

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as CategoryEntity

        if (cid != other.cid) return false
        if (cname != other.cname) return false

        return true
    }

}

