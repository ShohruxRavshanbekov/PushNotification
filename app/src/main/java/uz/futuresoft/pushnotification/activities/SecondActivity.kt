package uz.futuresoft.pushnotification.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import uz.futuresoft.pushnotification.R
import uz.futuresoft.pushnotification.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private val binding by lazy { ActivitySecondBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}