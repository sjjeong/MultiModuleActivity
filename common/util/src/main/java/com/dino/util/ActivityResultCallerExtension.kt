package com.dino.util

import android.app.Activity
import android.content.Intent
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultCaller
import androidx.activity.result.contract.ActivityResultContracts

fun ActivityResultCaller.register(action: (ActivityResult) -> Unit) =
    registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
        action(it)
    }


fun ActivityResultCaller.registerResult(
    resultCode: Int = Activity.RESULT_OK,
    action: (Intent?) -> Unit,
) =
    registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
        if (it.resultCode == resultCode) {
            action(it.data)
        }
    }

