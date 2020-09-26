package com.example.android.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random
class MainActivity : AppCompatActivity() {
    // todo (08) Создайте класс MainActivity, который будет расширять класс AppCompatActivity()
    lateinit var diceImage: ImageView

    // todo (09) добавьте модификатор переписывания к функции onCreate()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)

        rollButton.setOnClickListener {
            rollDice(diceImage)
        }

        diceImage = findViewById(R.id.dice_image)
    }



}