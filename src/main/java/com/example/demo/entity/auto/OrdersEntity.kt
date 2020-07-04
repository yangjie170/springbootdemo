package com.example.demo.entity.auto

import javax.persistence.*

@Entity
@Table(name = "orders", schema = "shop", catalog = "")
open class OrdersEntity {
    @get:Id
    @get:Column(name = "oid", nullable = false)
    var oid: String? = null
    @get:Basic
    @get:Column(name = "ordertime", nullable = true)
    var ordertime: java.sql.Timestamp? = null
    @get:Basic
    @get:Column(name = "total", nullable = true)
    var total: Double? = null
    @get:Basic
    @get:Column(name = "state", nullable = true)
    var state: Int? = null
    @get:Basic
    @get:Column(name = "address", nullable = true)
    var address: String? = null
    @get:Basic
    @get:Column(name = "name", nullable = true)
    var name: String? = null
    @get:Basic
    @get:Column(name = "telephone", nullable = true)
    var telephone: String? = null
    @get:Basic
    @get:Column(name = "uid", nullable = true)
    var uid: String? = null


    override fun toString(): String =
            "Entity of type: ${javaClass.name} ( " +
                    "oid = $oid " +
                    "ordertime = $ordertime " +
                    "total = $total " +
                    "state = $state " +
                    "address = $address " +
                    "name = $name " +
                    "telephone = $telephone " +
                    "uid = $uid " +
                    ")"

    // constant value returned to avoid entity inequality to itself before and after it's update/merge
    override fun hashCode(): Int = 42

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as OrdersEntity

        if (oid != other.oid) return false
        if (ordertime != other.ordertime) return false
        if (total != other.total) return false
        if (state != other.state) return false
        if (address != other.address) return false
        if (name != other.name) return false
        if (telephone != other.telephone) return false
        if (uid != other.uid) return false

        return true
    }

}

