package com.dino.splash

import androidx.lifecycle.lifecycleScope
import com.dino.splash.databinding.ActivitySplashBinding
import com.dino.ui.BaseActivity
import com.dino.util.startActivity
import kotlinx.coroutines.delay

class SplashActivity : BaseActivity<ActivitySplashBinding>(ActivitySplashBinding::inflate) {

    init {
        lifecycleScope.launchWhenCreated {
            delay(2000L)
            startActivity("com.dino.home.HomeActivity")
            finish()
        }
    }

}
