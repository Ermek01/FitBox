package kg.smartpost.fitbox.ui.trainings

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kg.smartpost.fitbox.databinding.FragmentTrainingsBinding

import kg.smartpost.fitbox.ui.trainings.adapter.MainTabAdapter

class TrainingsFragment : Fragment() {

    private var _binding: FragmentTrainingsBinding? = null
    private val binding: FragmentTrainingsBinding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTrainingsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fragments = arrayListOf<Fragment>()
        fragments.add(MuscleFragment())
        fragments.add(FatBurningFragment())
        fragments.add(CompilationsFragment())

        val titles = arrayListOf<String>()
        titles.add("Набор мышц")
        titles.add("Жиросжигание")
        titles.add("Подборки")

//        binding.tabLayout.addTab(binding.tabLayout.newTab().setText(titles[0]))
//        binding.tabLayout.addTab(binding.tabLayout.newTab().setText(titles[1]))
//        binding.tabLayout.addTab(binding.tabLayout.newTab().setText(titles[2]))

        val adapter =  MainTabAdapter(requireActivity().supportFragmentManager, fragments, titles)
        binding.viewPager.adapter = adapter
        binding.tabLayout.setupWithViewPager(binding.viewPager)
        binding.tabLayout.setTabsFromPagerAdapter(adapter)

    }

}