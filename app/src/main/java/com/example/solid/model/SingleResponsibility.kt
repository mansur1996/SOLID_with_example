package com.example.solid.model

/**
 * Example for anti-Single Responsibility
 */
class User {
    private var id : Int?= null
    private var name : String?= null
    private var pasword : String?= null

    fun signIn(){}
    fun signOut(){}
}

/**
 * Example for Single Responsibility
 */

//User class faqat userga tegishli ma'lumotlarni saqlaydi xalos
class User1 {
    private var id : Int?= null
    private var name : String?= null
    private var pasword : String?= null
}

class AuthenticationService{
    fun signIn(){}
    fun signOut(){}
}

