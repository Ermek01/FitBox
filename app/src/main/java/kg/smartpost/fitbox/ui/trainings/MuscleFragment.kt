package kg.smartpost.fitbox.ui.trainings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator
import kg.smartpost.fitbox.databinding.FragmentMuscleBinding
import kg.smartpost.fitbox.ui.trainings.adapter.TypeTabAdapter


class MuscleFragment : Fragment() {

    private var _binding: FragmentMuscleBinding? = null
    private val binding: FragmentMuscleBinding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMuscleBinding.inflate(inflater, container, false)
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
                0 -> tab.text = "C fitbox"
                else -> tab.text = "fitbox + инвентарь"
            }
        }.attach()

//        val fragments = arrayListOf<Fragment>()
//        fragments.add(FitboxFragment())
//        fragments.add(InventoryFragment())
//
//        val titles = arrayListOf<String>()
//        titles.add("C fitbox")
//        titles.add("fitbox + инвентарь")
//
//        binding.tabLayout.addTab(binding.tabLayout.newTab().setText(titles[0]))
//        binding.tabLayout.addTab(binding.tabLayout.newTab().setText(titles[1]))
//
//        val adapter =  TypeTabAdapter(requireActivity().supportFragmentManager, fragments, titles)
//        binding.viewPager.adapter = adapter
//        binding.tabLayout.setupWithViewPager(binding.viewPager)
//        binding.tabLayout.setTabsFromPagerAdapter(adapter)

    }

    private fun createAdapter(): TypeTabAdapter {
        return TypeTabAdapter(requireActivity())
    }

}