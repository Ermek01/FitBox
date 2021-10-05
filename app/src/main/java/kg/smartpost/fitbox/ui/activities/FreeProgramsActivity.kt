package kg.smartpost.fitbox.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kg.smartpost.fitbox.R
import kg.smartpost.fitbox.databinding.ActivityFreeProgramsBinding
import kg.smartpost.fitbox.databinding.ActivityMarathonBinding
import kg.smartpost.fitbox.ui.feed.adapter.WorkoutAdapter

class FreeProgramsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFreeProgramsBinding
    private lateinit var workoutAdapter: WorkoutAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFreeProgramsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        workoutAdapter = WorkoutAdapter()
        binding.recyclerView.adapter = workoutAdapter

        binding.btnCancel.setOnClickListener {
            finish()
        }

    }
}