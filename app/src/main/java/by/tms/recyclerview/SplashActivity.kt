package by.tms.recyclerview

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.*


class SplashActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_layout)

        CoroutineScope(Dispatchers.IO).launch {
            waitAndTransitToMain()
        }
    }

    suspend fun waitAndTransitToMain() {
        delay(2000)
        withContext(Dispatchers.Main) {
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
        }
    }
}