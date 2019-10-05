package com.example.passwordgenerator

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.StringBuilder
import kotlin.random.Random

@Suppress("UNUSED_CHANGED_VALUE")
class MainActivity : AppCompatActivity() {


    @ExperimentalStdlibApi
    @RequiresApi(Build.VERSION_CODES.N)
    private fun stringGenerator(): String {
    var upperCaseChars = "QWERTYUIOPLKJHGFDSAZXCVBNM"
        var lowerCaseChars = "qwertyuioplkjhgfdsazxcvbnm"
        var numChars = "0123456789"
        var specialChars = "!@#$%^&*()"
        var maxLenght = 10

        var allowedChars = "$upperCaseChars $lowerCaseChars $numChars $specialChars"
        var random = Random
        var randomPass = StringBuilder(maxLenght)
        randomPass.append(allowedChars.toCharArray(random.nextInt(allowedChars.length -1)))
            var i = randomPass.length
        repeat(maxLenght.rangeTo(other = i++).count()) {
        }
        return randomPass.toString()


    }


    @ExperimentalStdlibApi
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvButton.setOnClickListener {
            var pass = stringGenerator()
            textView1.text = pass
        }
    }
}
