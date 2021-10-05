package kg.smartpost.fitbox.ui.trainings

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayoutMediator
import kg.smartpost.fitbox.R
import kg.smartpost.fitbox.databinding.FragmentFitboxBinding
import kg.smartpost.fitbox.databinding.FragmentMuscleBinding
import kg.smartpost.fitbox.ui.trainings.adapter.LevelTabAdapter
import kg.smartpost.fitbox.ui.trainings.adapter.TypeTabAdapter

class FitboxFragment : Fragment() {

    private var _binding: FragmentFitboxBinding? = null
    private val binding: FragmentFitboxBinding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFitboxBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.viewPager.adapter = createAdapter()
        binding.viewPager.isUserInputEnabled = false
        TabLayoutMediator(
            binding.tabLayout, binding.viewPager
        ) { tab, position ->
            when (position) {
                0 -> tab.text = "Легко"
                1 -> tab.text = "Средне"
                else -> tab.text = "Трудно"
            }
        }.attach()
    }

    private fun createAdapter(): LevelTabAdapter {
        return LevelTabAdapter(requireActivity())
    }
}