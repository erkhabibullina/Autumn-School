package com.example.android.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var diceImage2: ImageView
    lateinit var diceImage1: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton1: Button = findViewById(R.id.roll_button1)
        val rollButton2: Button = findViewById(R.id.roll_button2)
        rollButton1.setOnClickListener {
            rollDice(diceImage1)
        }
        rollButton2.setOnClickListener {
            rollDice(diceImage1)
            rollDice(diceImage2)
        }
        diceImage1 = findViewById(R.id.dice_image1)
        diceImage2 = findViewById(R.id.dice_image2)
    }
}


