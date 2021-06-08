package com.dino.input

import android.content.Intent
import android.view.View
import com.dino.input.databinding.ActivityInputBinding
import com.dino.ui.BaseActivity

class InputActivity : BaseActivity<ActivityInputBinding>(ActivityInputBinding::inflate) {

    fun complete(view: View) {
        val input = binding.etInput.text.toString()
        val intent = Intent().apply {
            putExtra("input", input)
        }
        setResult(RESULT_OK, intent)
        finish()
    }

}
