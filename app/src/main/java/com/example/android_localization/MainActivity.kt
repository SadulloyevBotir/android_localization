package com.example.android_localization

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android_localization.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        initViews()
    }

    private fun initViews() {
        binding.bnEnglish.setOnClickListener {
            setLocale("en")
        }
        binding.bnRussian.setOnClickListener {
            setLocale("ru")
        }
        binding.bnUzbek.setOnClickListener {
            setLocale("uz")
        }

    }

    private fun setLocale(lan: String) {
        val locale = Locale(lan)
        Locale.setDefault(locale)
        val config = Configuration()
        config.locale = locale
        baseContext.resources.updateConfiguration(config, baseContext.resources.displayMetrics)
        finish()
    }
}