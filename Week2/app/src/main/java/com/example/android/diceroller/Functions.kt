package com.example.android.diceroller

import android.widget.ImageView
import kotlin.random.Random

fun rollDice(diceImage : ImageView) {
    val randomInt = Random.nextInt(6) + 1
    val drawableResource = when (randomInt) {
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
    }
    diceImage.setImageResource(drawableResource)
}
// todo (10) перенести сюда функцию rollDice()
// todo (11) попробуйте поставить приватный модификатор доступа и запустить приложение