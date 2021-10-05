package kg.smartpost.fitbox.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kg.smartpost.fitbox.R
import kg.smartpost.fitbox.databinding.ActivityMainBinding
import kg.smartpost.fitbox.databinding.ActivityNewsBinding
import kg.smartpost.fitbox.ui.feed.adapter.CoachAdapter
import kg.smartpost.fitbox.ui.feed.adapter.NewsPagerAdapter
import kg.smartpost.fitbox.ui.feed.adapter.WorkoutAdapter

class NewsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNewsBinding

    private lateinit var workoutAdapter: WorkoutAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        workoutAdapter = WorkoutAdapter()
        binding.recyclerView.adapter = workoutAdapter

        binding.btnCancel.setOnClickListener {
            finish()
        }

    }
}