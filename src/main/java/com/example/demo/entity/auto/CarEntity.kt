package com.example.demo.entity.auto

import javax.persistence.*

@Entity
@Table(name = "car", schema = "shop", catalog = "")
open class CarEntity {
    @get:Basic
    @get:Column(name = "uid", nullable = false)
    var uid: Int? = null
    @get:Id
    @get:Column(name = "rec_id", nullable = false)
    var recId: Int? = null
    @get:Basic
    @get:Column(name = "goods_id", nullable = true)
    var goodsId: Int? = null
    @get:Basic
    @get:Column(name = "goods_name", nullable = true)
    var goodsName: String? = null
    @get:Basic
    @get:Column(name = "goods_number", nullable = true)
    var goodsNumber: Int? = null
    @get:Basic
    @get:Column(name = "subtotal", nullable = true)
    var subtotal: String? = null
    @get:Basic
    @get:Column(name = "img", nullable = true)
    var img: String? = null


    override fun toString(): String =
            "Entity of type: ${javaClass.name} ( " +
                    "uid = $uid " +
                    "recId = $recId " +
                    "goodsId = $goodsId " +
                    "goodsName = $goodsName " +
                    "goodsNumber = $goodsNumber " +
                    "subtotal = $subtotal " +
                    "img = $img " +
                    ")"

    // constant value returned to avoid entity inequality to itself before and after it's update/merge
    override fun hashCode(): Int = 42

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as CarEntity

        if (uid != other.uid) return false
        if (recId != other.recId) return false
        if (goodsId != other.goodsId) return false
        if (goodsName != other.goodsName) return false
        if (goodsNumber != other.goodsNumber) return false
        if (subtotal != other.subtotal) return false
        if (img != other.img) return false

        return true
    }

}

