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

import android.content.ActivityNotFoundException
import android.content.Intent
import androidx.databinding.DataBindingUtil
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.core.app.ShareCompat
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.findNavController
import com.example.android.navigation.databinding.FragmentGameWonBinding
import android.content.pm.ResolveInfo
import android.content.pm.PackageManager



class GameWonFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding: FragmentGameWonBinding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_game_won, container, false)
        // todo сделать так, чтобы при нажатии на nextMatchButton мы бы перешли на GameFragment
        binding.nextMatchButton.setOnClickListener { view: View ->
            view.findNavController().navigate(
                    GameWonFragmentDirections.actionGameWonFragmentToGameFragment())
        }
        // todo поставить true у setHasOptionsMenu
        return binding.root
    }

    // todo написать метод getShareIntent, который вернет share intent с
    // todo текстом R.string.share_success_text и аргументами numCorrect и NumQuestions
    private fun getShareIntent() : Intent {
        val args = GameWonFragmentArgs.fromBundle(requireArguments())
        return ShareCompat.IntentBuilder.from(activity!!)
                .setText(getString(R.string.share_success_text, args.numCorrect, args.numQuestions))
                .setType("text/plain")
                .intent
    }

    // todo написать метод shareSuccess(), который запустит активити с аргументом getShareIntent
    private fun shareSuccess() {
        startActivity(getShareIntent())
    }

    // todo переписать onCreateOptionsMenu, в котором мы будем инфлейтить меню и проверять, находимся
    // todo мы на экране активити или нет, и если нет, то прятать значки меню
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.winner_menu, menu)
        // check if the activity resolves
        if (null == getShareIntent().resolveActivity(requireActivity().packageManager)) {
            // hide the menu item if it doesn't resolve
            menu.findItem(R.id.share)?.isVisible = false
        }
    }

    // todo переписать onOptionsItemSelected, который будет проверять все item.itemId, и если он равен R.id.share,
    // todo то вызывать метод shareSuccess()
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.share -> shareSuccess()
        }
        return super.onOptionsItemSelected(item)
    }
}
