package com.dino.home

import android.view.View
import com.dino.home.databinding.ActivityHomeBinding
import com.dino.ui.BaseActivity
import com.dino.util.createIntent
import com.dino.util.registerResult

class HomeActivity : BaseActivity<ActivityHomeBinding>(ActivityHomeBinding::inflate) {

    private val inputLauncher = registerResult {
        binding.tvInput.text = it?.getStringExtra("input") ?: "Unknown"
    }

    fun showInput(view: View) {
        inputLauncher.launch(createIntent("com.dino.input.InputActivity"))
    }
}
