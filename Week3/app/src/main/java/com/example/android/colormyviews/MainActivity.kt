/*
 * Copyright (C) 2018 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.colormyviews

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // todo наследуйте и перепишите функцию onCreate
    // todo соедините layout (activity_main.xml) с классом activity (MainActivity)
    // todo добавьте listeners для всех View вашего лэйаута

    /**
     * Attaches listeners to all the views.
     */
    private fun setListeners() {
        // todo создайте переменную, в которой будет храниться список всех View из @layout/activity_main (их должно быть 9)

        // todo используя цикл, для всех View в clickableViews назначьте listener, такой, чтобы View меняла цвет при нажатии на неё
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
    // todo добавьте параметр view типа View для makeColored()
    private fun makeColored() {
        // todo добавьте блок when, в котором мы поставим бекграунды для View в зависимости от её id

        // todo поставьте box_one_text и box_two_text бекграунды соответственно тёмно-серого и серого цвета, используя класс Color

        // todo поставьте box_three_text, box_four_text и box_five_text бекграунды соответственно holo_green_light, holo_green_dark и holo_green_light, используя Android color resources

        // todo поставьте red_button, yellow_button и green_button бекграунды соответственно красного, жёлтого и зелёного цвета, используя цвета, которые вы добавили самостоятельно

        // todo если View id не подходит под значения выше, у View должен быть бекграунд Color.LTGRAY
    }
}