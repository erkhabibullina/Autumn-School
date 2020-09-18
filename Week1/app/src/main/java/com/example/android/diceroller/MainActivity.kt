package com.example.android.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    // todo (03) Создайте переменную diceImage типа ImageView с отложенной инициализацией

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)




        setContentView(R.layout.activity_main)
        // todo (05) Создайте и присвойте переменной rollButton значение Button с id = roll_button, используя функцию findViewById

        // todo (10) Добавьте clickListener на кнопку rollButton и внутри вызовите функцию rollDice()

        // todo (04) Присвойте переменной diceImage значение ImageView с id = dice_image, используя функцию findViewById
    }

    // todo (06) Создайте функцию rollDice. Задания 7-9 выполнить внутри тела функции rollDice()
    // todo (07) Создайте переменную randomInt и присвойте ей значение Random().nextInt(6) + 1
    // todo (08) Создайте переменную drawableResource и присвойте ей значение when (randomInt) {
    //            1 -> R.drawable.dice_1
    //            2 -> R.drawable.dice_2
    //            3 -> R.drawable.dice_3
    //            4 -> R.drawable.dice_4
    //            5 -> R.drawable.dice_5
    //            else -> R.drawable.dice_6
    //        }
    // todo (09) Поставьте в diceImage полученный drawableResource с помощью функции setImageResource
}
