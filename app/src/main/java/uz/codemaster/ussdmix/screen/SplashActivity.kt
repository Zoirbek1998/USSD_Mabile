package uz.codemaster.ussdmix.screen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_splash.*
import uz.codemaster.ussdmix.R

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        textView2.postDelayed( {
            finish()
            startActivity(Intent(this, MainActivity::class.java))
        }, 2000)
    }
}
