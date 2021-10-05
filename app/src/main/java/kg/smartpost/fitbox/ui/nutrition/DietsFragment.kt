package kg.smartpost.fitbox.ui.nutrition

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kg.smartpost.fitbox.R
import kg.smartpost.fitbox.databinding.FragmentDietsBinding
import kg.smartpost.fitbox.databinding.FragmentFeedBinding
import kg.smartpost.fitbox.ui.nutrition.adapter.DietsAdapter

class DietsFragment : Fragment() {

    private var _binding: FragmentDietsBinding? = null
    private val binding: FragmentDietsBinding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDietsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = DietsAdapter()
        binding.recyclerView.adapter = adapter

    }

}