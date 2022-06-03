package com.example.solid.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.solid.R
import com.example.solid.model.*
import java.util.*

/**
 * SOLID -> dasturiy ta'minot dizaynini tushunarli, moslashuvchan va uzoq vaqt xizmat ko'rsatadigan
 * qilish uchun mo'jjallangan beshta dizayn tamoyillari uchun mnemonik qisqartma.
 */

/**
 * Single Responsibility (yagona javobgarlik)- Har bir class/methodni faqat bitta javobgarligi bo'lishi kerak
 */

/**
 * Open-Closed (ochiq-yopiqlik tamoyili) - Classga yangi funksiyalar qo'shish mumkin, lekin mavjud
 * funksiyalarni o'zgartirish mumkin bo'lmasligi kerak
 */

/**
 * Liskov Substitution (Liskovni almashtirish tamoyili) - Parent class objectlarni dasturni buzmasdan subclass objectlari
 * bilan almashtirishga imkon beradi. Buning uchun barcha classlar ota classga o'xshab harahat qilishi kerak
 */

/**
 * Interface Segregation (Interfacelarni ajratish tamoyili) Subclasslar uning ba'zi methodlarini ishlatib ba'zi methodlarini
 * ishlatmaydigan yagona katta interfacedan ko'ra, faqat alohida-alohida interface qilib ishlatgan ma'qul
 */

/**
 * Dependency Inversion (Bog'liqlik inversiyasi tamoyili) Sizning kodingiz abstraksiyaga bog'liq bo'lishi kerak
 * konkret classga emas
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        val androidDeveloper = AndroidDeveloper()
        val iosDeveloper = IosDeveloper()

        androidDeveloper.developMobileApp()
        iosDeveloper.developMobileApp()

        /**
         *
         */

        val developers = listOf(AndroidDeveloper1(AndroidDeveloper1.MobileServices.HMS), IosDeveloper1())
        for (developer in developers){
            developer.developMobileApp()
        }
    }
}