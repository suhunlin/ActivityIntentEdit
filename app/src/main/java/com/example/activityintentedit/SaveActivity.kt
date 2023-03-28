package com.example.activityintentedit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.activityintentedit.databinding.ActivitySaveBinding

class SaveActivity : AppCompatActivity() {
    private lateinit var binding:ActivitySaveBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySaveBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}