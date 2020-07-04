package com.example.demo.entity.auto

import javax.persistence.*

@Entity
@Table(name = "product", schema = "shop", catalog = "")
open class ProductEntity {
    @get:Id
    @get:Column(name = "pid", nullable = false)
    var pid: Int? = null
    @get:Basic
    @get:Column(name = "pname", nullable = true)
    var pname: String? = null
    @get:Basic
    @get:Column(name = "mark_price", nullable = true)
    var markPrice: Double? = null
    @get:Basic
    @get:Column(name = "shop_price", nullable = true)
    var shopPrice: Double? = null
    @get:Basic
    @get:Column(name = "pimage", nullable = true)
    var pimage: String? = null
    @get:Basic
    @get:Column(name = "pdate", nullable = true)
    var pdate: java.sql.Date? = null
    @get:Basic
    @get:Column(name = "is_hot", nullable = true)
    var isHot: Int? = null
    @get:Basic
    @get:Column(name = "pdesc", nullable = true)
    var pdesc: String? = null
    @get:Basic
    @get:Column(name = "pflag", nullable = true)
    var pflag: Int? = null
    @get:Basic
    @get:Column(name = "detial", nullable = true)
    var detial: String? = null
    @get:Basic
    @get:Column(name = "cid", nullable = false)
    var cid: String? = null


    override fun toString(): String =
            "Entity of type: ${javaClass.name} ( " +
                    "pid = $pid " +
                    "pname = $pname " +
                    "markPrice = $markPrice " +
                    "shopPrice = $shopPrice " +
                    "pimage = $pimage " +
                    "pdate = $pdate " +
                    "isHot = $isHot " +
                    "pdesc = $pdesc " +
                    "pflag = $pflag " +
                    "detial = $detial " +
                    "cid = $cid " +
                    ")"

    // constant value returned to avoid entity inequality to itself before and after it's update/merge
    override fun hashCode(): Int = 42

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as ProductEntity

        if (pid != other.pid) return false
        if (pname != other.pname) return false
        if (markPrice != other.markPrice) return false
        if (shopPrice != other.shopPrice) return false
        if (pimage != other.pimage) return false
        if (pdate != other.pdate) return false
        if (isHot != other.isHot) return false
        if (pdesc != other.pdesc) return false
        if (pflag != other.pflag) return false
        if (detial != other.detial) return false
        if (cid != other.cid) return false

        return true
    }

}

