package com.example.android.colormyviews

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // todo (08) наследуйте и перепишите функцию onCreate
    // todo (09) соедините layout (activity_main.xml) с классом activity (MainActivity)
    // todo (10) добавьте listeners для всех View вашего лэйаута

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    /**
     * Attaches listeners to all the views.
     */
    private fun setListeners() {
        // todo (11) создайте переменную, в которой будет храниться список всех View из @layout/activity_main (их должно быть 9)
        val clickableViews : List<View> = listOf(box_one_text, box_two_text, box_three_text, box_four_text, box_five_text, constraint_layout,
        red_button, yellow_button, green_button)

        // todo (12) используя цикл, для всех View в clickableViews назначьте listener, такой, чтобы View меняла цвет при нажатии на неё
        for (now in clickableViews) {
            now.setOnClickListener { makeColored(now) }
        }
    }

    /**
     * Sets the background color of a view depending on it's resource id.
     * This is a way of using one click handler to do similar operations on a group of views.
     *
     * Demonstrates three different ways of setting colors.
     *     * Using a color constant from the Color class.
     *     * Using an Android color resource
     *     * Using a custom color defined in color.xml
     */
    // todo (13) добавьте параметр view типа View для makeColored()
    private fun makeColored(view : View) {
        // todo (14) добавьте блок when, в котором мы поставим бекграунды для View в зависимости от её id
        when (view.id) {
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> view.setBackgroundColor(resources.getColor(android.R.color.holo_green_light))
            R.id.box_four_text -> view.setBackgroundColor(resources.getColor(android.R.color.holo_green_dark))
            R.id.box_five_text -> view.setBackgroundColor(resources.getColor(android.R.color.holo_green_light))

            R.id.red_button -> view.setBackgroundColor(resources.getColor(R.color.my_red))
            R.id.yellow_button -> view.setBackgroundColor(resources.getColor(R.color.my_yellow))
            R.id.green_button -> view.setBackgroundColor(resources.getColor(R.color.my_green))

            else -> view.setBackgroundColor(Color.LTGRAY)
        }

            // todo (15) поставьте box_one_text и box_two_text бекграунды соответственно тёмно-серого и серого цвета, используя класс Color

        // todo (16) поставьте box_three_text, box_four_text и box_five_text бекграунды соответственно holo_green_light, holo_green_dark и holo_green_light, используя Android color resources

        // todo (17) поставьте red_button, yellow_button и green_button бекграунды соответственно красного, жёлтого и зелёного цвета, используя цвета, которые вы добавили самостоятельно

        // todo (18) если View id не подходит под значения выше, у View должен быть бекграунд Color.LTGRAY
    }
}