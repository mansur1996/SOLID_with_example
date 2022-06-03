package com.example.solid.model

/**
 * Example for anti-Liskov Substitution
 */
abstract class Vehicle {
    var isEngineWorking = false
    abstract fun startEngine()
    abstract fun stopEngine()
    abstract fun moveForward()
    abstract fun moveBack()
}

class Car : Vehicle() {
    override fun startEngine() {
        println("Engine started")
        isEngineWorking = true
    }

    override fun stopEngine() {
        println("Engine stopped")
    }

    override fun moveForward() {
        println("Moving forward")
    }

    override fun moveBack() {
        println("Moving back")
    }
}

class Bicycle : Vehicle(){
    override fun startEngine() {

    }

    override fun stopEngine() {

    }

    override fun moveForward() {
        println("Moving forward")
    }

    override fun moveBack() {
        println("Moving back")
    }

}

/**
 * Example for Liskov Substitution
 */

interface Vehicle1 {
    fun moveForward()
    fun moveBack()
}

abstract class VehicleWithEngine : Vehicle1{
    var isEngineWorking1 = false

    open fun startEngine1(){
        isEngineWorking1 = true
    }
    open fun stopEngine1(){
        isEngineWorking1 = false
    }
}

class Car1 : VehicleWithEngine(){
    override fun startEngine1(){
        super.startEngine1()
        isEngineWorking1 = true
    }

    override fun stopEngine1(){
        super.stopEngine1()
        isEngineWorking1 = false
    }

    override fun moveForward() {
        println("Moving forward")
    }

    override fun moveBack() {
        println("Moving back")
    }
}

class Bicycle1 : Vehicle1{
    override fun moveForward() {
        println("Moving forward")
    }

    override fun moveBack() {
        println("Moving back")
    }

}