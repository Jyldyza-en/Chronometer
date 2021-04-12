package kg.tutorialapp.stopwatch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.widget.Button
import android.widget.Chronometer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var chronometer = findViewById<Chronometer>(R.id.Chronometer)

        val start = findViewById<Button>(R.id.button)
        val stop = findViewById<Button>(R.id.button2)
        val reset = findViewById<Button>(R.id.button3)

        start.setOnClickListener {
            chronometer.base = SystemClock.elapsedRealtime()
            chronometer.start()
        }
        stop.setOnClickListener {
            chronometer.stop()
        }
        reset.setOnClickListener {
            chronometer.base = SystemClock.elapsedRealtime()
        }


    }
}

