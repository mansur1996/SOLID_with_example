package com.example.solid.model

/**
 * Example for anti-Dependency Inversion
 */
class AndroidDeveloper {
    fun developMobileApp(){
        println("Developing Android Application by using Kotlin")
    }
}

class IosDeveloper {
    fun developMobileApp(){
        println("Developing IOS Application by using Swift")
    }
}

/**
 * Example for Dependency Inversion
 */
interface MobileDeveloper{
    fun developMobileApp()
}

class AndroidDeveloper1(private val mobileServices: MobileServices) : MobileDeveloper{

    override fun developMobileApp() {
        println("Developing Android Application by using Kotlin Application works with ${mobileServices.serviceName}")

    }
    enum class MobileServices(val serviceName : String){
        HMS("Huawei Mobile Service"),
        GMS("Google Mobile Service"),
        BOTH("Huawei Mobile Service and Google Mobile Service")
    }
}

class IosDeveloper1:MobileDeveloper{
    override fun developMobileApp() {
        println("Developing IOS Application by using Swift")
    }

}


