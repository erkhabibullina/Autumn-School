/*
 * Copyright 2018, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.navigation

import androidx.databinding.DataBindingUtil
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.example.android.navigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // todo (29) сделать отложенную переменную drawerLayout, которая экстендид DrawerLayout
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var appBarConfiguration : AppBarConfiguration
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        // todo (30) присвоить переменной drawerLayout - binding.drawerLayout
        drawerLayout = binding.drawerLayout
        // todo (31) сделать переменную navController, которая будет равна this.findNavController(R.id.myNavHostFragment)
        val navController = this.findNavController(R.id.myNavHostFragment)
        // todo (32) с помощью NavigationUI засетапить экшн бар
        NavigationUI.setupActionBarWithNavController(this, navController, drawerLayout)
        // todo (33) инициализировать appBarConfiguration с помощью AppBarConfiguration
        appBarConfiguration = AppBarConfiguration(navController.graph, drawerLayout)
        // todo (34) предотвратить возможность свайпа навдровера не со старт дестинейшна
        // todo (35) с помощью NavigationUI засетапить нав контроллер
        NavigationUI.setupWithNavController(binding.navView, navController)

    }

    // todo (36) переписать onSupportNavigateUp, где инициализировать заново навконтроллер и ретернуть
    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.myNavHostFragment)
        return NavigationUI.navigateUp(navController, appBarConfiguration)
    }
    // todo NavigationUI.navigateUp
}
