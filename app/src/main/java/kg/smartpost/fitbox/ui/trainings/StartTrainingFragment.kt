package kg.smartpost.fitbox.ui.trainings

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kg.smartpost.fitbox.R
import kg.smartpost.fitbox.databinding.FragmentStartTrainingBinding
import kg.smartpost.fitbox.databinding.FragmentWorkoutDetailBinding


class StartTrainingFragment : Fragment() {

    private var _binding: FragmentStartTrainingBinding? = null
    private val binding: FragmentStartTrainingBinding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentStartTrainingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNext.setOnClickListener {
            findNavController().navigate(R.id.workoutCompletedFragment)
        }

        binding.btnCancel.setOnClickListener {
            findNavController().popBackStack()
        }
    }

}