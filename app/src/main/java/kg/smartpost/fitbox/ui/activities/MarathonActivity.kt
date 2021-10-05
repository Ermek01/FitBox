package kg.smartpost.fitbox.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kg.smartpost.fitbox.R
import kg.smartpost.fitbox.databinding.ActivityMainBinding
import kg.smartpost.fitbox.databinding.ActivityMarathonBinding
import kg.smartpost.fitbox.ui.feed.adapter.WorkoutAdapter

class MarathonActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMarathonBinding

    private lateinit var workoutAdapter: WorkoutAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMarathonBinding.inflate(layoutInflater)
        setContentView(binding.root)

        workoutAdapter = WorkoutAdapter()
        binding.recyclerView.adapter = workoutAdapter

        binding.btnCancel.setOnClickListener {
            finish()
        }

        binding.btnMarathon.setOnClickListener {
            startActivity(Intent(this, OrderingActivity::class.java))
        }

    }
}