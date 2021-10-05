package kg.smartpost.fitbox.ui.trainings

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kg.smartpost.fitbox.R
import kg.smartpost.fitbox.databinding.FragmentFeedBinding
import kg.smartpost.fitbox.databinding.FragmentWorkoutBinding
import kg.smartpost.fitbox.ui.feed.adapter.CoachAdapter
import kg.smartpost.fitbox.ui.trainings.adapter.WorkoutViewAdapter

class WorkoutFragment : Fragment() {

    private var _binding: FragmentWorkoutBinding? = null
    private val binding: FragmentWorkoutBinding get() = _binding!!

    private lateinit var workoutViewAdapter: WorkoutViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentWorkoutBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        workoutViewAdapter = WorkoutViewAdapter()
        binding.recyclerView.adapter = workoutViewAdapter

        binding.btn.setOnClickListener {
            findNavController().navigate(R.id.workoutWithFitboxFragment)
        }

        binding.btnCancel.setOnClickListener {
            requireActivity().finish()
        }
    }
}