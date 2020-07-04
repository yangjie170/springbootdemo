package com.example.demo.entity.auto

import javax.persistence.*

@Entity
@Table(name = "region", schema = "shop", catalog = "")
open class RegionEntity {
    @get:Id
    @get:Column(name = "region_id", nullable = false)
    var regionId: Int? = null
    @get:Basic
    @get:Column(name = "region_level", nullable = true)
    var regionLevel: String? = null
    @get:Basic
    @get:Column(name = "parent_id", nullable = true)
    var parentId: Int? = null
    @get:Basic
    @get:Column(name = "region_name", nullable = true)
    var regionName: String? = null


    override fun toString(): String =
            "Entity of type: ${javaClass.name} ( " +
                    "regionId = $regionId " +
                    "regionLevel = $regionLevel " +
                    "parentId = $parentId " +
                    "regionName = $regionName " +
                    ")"

    // constant value returned to avoid entity inequality to itself before and after it's update/merge
    override fun hashCode(): Int = 42

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as RegionEntity

        if (regionId != other.regionId) return false
        if (regionLevel != other.regionLevel) return false
        if (parentId != other.parentId) return false
        if (regionName != other.regionName) return false

        return true
    }

}

