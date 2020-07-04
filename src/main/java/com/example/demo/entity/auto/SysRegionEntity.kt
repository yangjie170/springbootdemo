package com.example.demo.entity.auto

import javax.persistence.*

@Entity
@Table(name = "sys_region", schema = "shop", catalog = "")
open class SysRegionEntity {
    @get:Id
    @get:Column(name = "region_id", nullable = false)
    var regionId: String? = null
    @get:Basic
    @get:Column(name = "region_name", nullable = false)
    var regionName: String? = null
    @get:Basic
    @get:Column(name = "region_short_name", nullable = true)
    var regionShortName: String? = null
    @get:Basic
    @get:Column(name = "region_code", nullable = true)
    var regionCode: String? = null
    @get:Basic
    @get:Column(name = "region_parent_id", nullable = true)
    var regionParentId: String? = null
    @get:Basic
    @get:Column(name = "region_level", nullable = true)
    var regionLevel: Int? = null


    override fun toString(): String =
            "Entity of type: ${javaClass.name} ( " +
                    "regionId = $regionId " +
                    "regionName = $regionName " +
                    "regionShortName = $regionShortName " +
                    "regionCode = $regionCode " +
                    "regionParentId = $regionParentId " +
                    "regionLevel = $regionLevel " +
                    ")"

    // constant value returned to avoid entity inequality to itself before and after it's update/merge
    override fun hashCode(): Int = 42

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as SysRegionEntity

        if (regionId != other.regionId) return false
        if (regionName != other.regionName) return false
        if (regionShortName != other.regionShortName) return false
        if (regionCode != other.regionCode) return false
        if (regionParentId != other.regionParentId) return false
        if (regionLevel != other.regionLevel) return false

        return true
    }

}

