package com.example.demo.entity.auto

import javax.persistence.*

@Entity
@Table(name = "ordergoods", schema = "shop", catalog = "")
open class OrdergoodsEntity {
    @get:Basic
    @get:Column(name = "goods_id", nullable = false)
    var goodsId: Int? = null
    @get:Basic
    @get:Column(name = "name", nullable = true)
    var name: String? = null
    @get:Basic
    @get:Column(name = "goods_number", nullable = true)
    var goodsNumber: Int? = null
    @get:Basic
    @get:Column(name = "subtotal", nullable = true)
    var subtotal: String? = null
    @get:Basic
    @get:Column(name = "formated_shop_price", nullable = true)
    var formatedShopPrice: String? = null
    @get:Basic
    @get:Column(name = "img", nullable = true)
    var img: String? = null
    @get:Id
    @get:Column(name = "orderid", nullable = false)
    var orderid: String? = null


    override fun toString(): String =
            "Entity of type: ${javaClass.name} ( " +
                    "goodsId = $goodsId " +
                    "name = $name " +
                    "goodsNumber = $goodsNumber " +
                    "subtotal = $subtotal " +
                    "formatedShopPrice = $formatedShopPrice " +
                    "img = $img " +
                    "orderid = $orderid " +
                    ")"

    // constant value returned to avoid entity inequality to itself before and after it's update/merge
    override fun hashCode(): Int = 42

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as OrdergoodsEntity

        if (goodsId != other.goodsId) return false
        if (name != other.name) return false
        if (goodsNumber != other.goodsNumber) return false
        if (subtotal != other.subtotal) return false
        if (formatedShopPrice != other.formatedShopPrice) return false
        if (img != other.img) return false
        if (orderid != other.orderid) return false

        return true
    }

}

