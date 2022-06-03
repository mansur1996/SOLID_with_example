package com.example.solid.model

import java.lang.RuntimeException

/**
 * Example for anti-Open-Closed
 */
class Rectangle {
    var length: Double? = null
    var height: Double? = null
}

class Circle {
    var radius: Double? = null
}

class AreaFactory {
    fun calculateArea(shapes: List<Any>) : Double {
        var area = 0.0
        for (shape in shapes) {
            if (shape is Rectangle) {
                var rect = shape as Rectangle
                area += rect.length!! * rect.height!!
            } else if (shape is Circle) {
                var circle = shape as Circle
                area += Math.PI * circle.radius!! * circle.radius!!
            }else{
                throw RuntimeException("shape not supported")
            }
        }
        return area
    }
}

/**
 * Example for Open-Closed
 */

interface Shape{
    fun getArea() : Double
}

class Rectangle1 : Shape {
    var length: Double? = null
    var height: Double? = null
    override fun getArea(): Double {
        return length!! * height!!
    }
}

class Circle1 : Shape {
    var radius: Double? = null
    override fun getArea(): Double {
        return Math.PI * radius!! * radius!!
    }
}

class AreaFactory1 {
    fun calculateArea(shapes: List<Shape>) : Double {
        var area = 0.0
        for (shape in shapes) {
           area += shape.getArea()
        }
        return area
    }
}