package kg.smartpost.fitbox.ui.trainings

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kg.smartpost.fitbox.R
import kg.smartpost.fitbox.databinding.FragmentWorkoutCompletedBinding
import kg.smartpost.fitbox.databinding.FragmentWorkoutDetailBinding

class WorkoutCompletedFragment : Fragment() {

    private var _binding: FragmentWorkoutCompletedBinding? = null
    private val binding: FragmentWorkoutCompletedBinding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentWorkoutCompletedBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnMenu.setOnClickListener {
            requireActivity().finish()
        }

    }


}