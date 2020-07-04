package com.example.demo.entity.auto

import javax.persistence.*

@Entity
@Table(name = "address", schema = "shop", catalog = "")
open class AddressEntity {
    @get:Id
    @get:Column(name = "id", nullable = false)
    var id: Int? = null
    @get:Basic
    @get:Column(name = "consignee", nullable = true)
    var consignee: String? = null
    @get:Basic
    @get:Column(name = "email", nullable = true)
    var email: String? = null
    @get:Basic
    @get:Column(name = "country_name", nullable = true)
    var countryName: String? = null
    @get:Basic
    @get:Column(name = "province_name", nullable = true)
    var provinceName: String? = null
    @get:Basic
    @get:Column(name = "city_name", nullable = true)
    var cityName: String? = null
    @get:Basic
    @get:Column(name = "district_name", nullable = true)
    var districtName: String? = null
    @get:Basic
    @get:Column(name = "address", nullable = true)
    var address: String? = null
    @get:Basic
    @get:Column(name = "zipcode", nullable = true)
    var zipcode: String? = null
    @get:Basic
    @get:Column(name = "tel", nullable = true)
    var tel: String? = null
    @get:Basic
    @get:Column(name = "mobile", nullable = true)
    var mobile: String? = null
    @get:Basic
    @get:Column(name = "default_address", nullable = true)
    var defaultAddress: Int? = null
    @get:Basic
    @get:Column(name = "country", nullable = true)
    var country: String? = null
    @get:Basic
    @get:Column(name = "province", nullable = true)
    var province: String? = null
    @get:Basic
    @get:Column(name = "district", nullable = true)
    var district: String? = null
    @get:Basic
    @get:Column(name = "city", nullable = true)
    var city: String? = null
    @get:Basic
    @get:Column(name = "uid", nullable = true)
    var uid: Int? = null


    override fun toString(): String =
            "Entity of type: ${javaClass.name} ( " +
                    "id = $id " +
                    "consignee = $consignee " +
                    "email = $email " +
                    "countryName = $countryName " +
                    "provinceName = $provinceName " +
                    "cityName = $cityName " +
                    "districtName = $districtName " +
                    "address = $address " +
                    "zipcode = $zipcode " +
                    "tel = $tel " +
                    "mobile = $mobile " +
                    "defaultAddress = $defaultAddress " +
                    "country = $country " +
                    "province = $province " +
                    "district = $district " +
                    "city = $city " +
                    "uid = $uid " +
                    ")"

    // constant value returned to avoid entity inequality to itself before and after it's update/merge
    override fun hashCode(): Int = 42

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as AddressEntity

        if (id != other.id) return false
        if (consignee != other.consignee) return false
        if (email != other.email) return false
        if (countryName != other.countryName) return false
        if (provinceName != other.provinceName) return false
        if (cityName != other.cityName) return false
        if (districtName != other.districtName) return false
        if (address != other.address) return false
        if (zipcode != other.zipcode) return false
        if (tel != other.tel) return false
        if (mobile != other.mobile) return false
        if (defaultAddress != other.defaultAddress) return false
        if (country != other.country) return false
        if (province != other.province) return false
        if (district != other.district) return false
        if (city != other.city) return false
        if (uid != other.uid) return false

        return true
    }

}

