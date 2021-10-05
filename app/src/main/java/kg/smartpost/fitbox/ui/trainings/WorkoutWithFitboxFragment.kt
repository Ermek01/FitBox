package kg.smartpost.fitbox.ui.trainings

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kg.smartpost.fitbox.databinding.FragmentWorkoutWithFitboxBinding
import kg.smartpost.fitbox.ui.trainings.adapter.WorkoutViewAllAdapter

class WorkoutWithFitboxFragment : Fragment() {

    private var _binding: FragmentWorkoutWithFitboxBinding? = null
    private val binding: FragmentWorkoutWithFitboxBinding get() = _binding!!

    private lateinit var adapter: WorkoutViewAllAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentWorkoutWithFitboxBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = WorkoutViewAllAdapter(this)
        binding.recyclerView.adapter = adapter

        binding.imgCancel.setOnClickListener {
            findNavController().popBackStack()
        }

    }
}