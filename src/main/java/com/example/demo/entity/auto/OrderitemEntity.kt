package com.example.demo.entity.auto

import javax.persistence.*

@Entity
@Table(name = "orderitem", schema = "shop", catalog = "")
open class OrderitemEntity {
    @get:Id
    @get:Column(name = "itemid", nullable = false)
    var itemid: String? = null
    @get:Basic
    @get:Column(name = "count", nullable = true)
    var count: Int? = null
    @get:Basic
    @get:Column(name = "subtotal", nullable = true)
    var subtotal: Double? = null
    @get:Basic
    @get:Column(name = "oid", nullable = true)
    var oid: String? = null
    @get:Basic
    @get:Column(name = "pid", nullable = true)
    var pid: String? = null


    override fun toString(): String =
            "Entity of type: ${javaClass.name} ( " +
                    "itemid = $itemid " +
                    "count = $count " +
                    "subtotal = $subtotal " +
                    "oid = $oid " +
                    "pid = $pid " +
                    ")"

    // constant value returned to avoid entity inequality to itself before and after it's update/merge
    override fun hashCode(): Int = 42

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as OrderitemEntity

        if (itemid != other.itemid) return false
        if (count != other.count) return false
        if (subtotal != other.subtotal) return false
        if (oid != other.oid) return false
        if (pid != other.pid) return false

        return true
    }

}

