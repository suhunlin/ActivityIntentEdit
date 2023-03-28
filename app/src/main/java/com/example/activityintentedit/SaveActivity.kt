package com.example.activityintentedit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.activityintentedit.databinding.ActivitySaveBinding

class SaveActivity : AppCompatActivity() {
    private lateinit var binding:ActivitySaveBinding
    var tag:String = SaveActivity::class.java.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySaveBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var name:String = intent.getStringExtra("NAME") ?:""
        Log.d(tag, "Get name from first page $name")
        binding.nameEditText.setText(name)
//        binding.nameEditText.text = "Happy"
        binding.saveButton.setOnClickListener {
            val getNameEdit:String = binding.nameEditText.text.toString()
            intent.putExtra("NAME", getNameEdit)
            setResult(RESULT_OK, intent)
            finish()
        }

        binding.cancelButton.setOnClickListener {
            setResult(RESULT_CANCELED)
            finish()
        }
    }
}