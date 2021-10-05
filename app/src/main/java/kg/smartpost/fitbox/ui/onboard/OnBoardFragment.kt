package kg.smartpost.fitbox.ui.onboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.viewpager.widget.ViewPager.OnPageChangeListener
import kg.smartpost.fitbox.R
import kg.smartpost.fitbox.databinding.FragmentOnBoardBinding
import kg.smartpost.fitbox.ui.splash.adapter.PagerAdapter

class OnBoardFragment : Fragment() {

    private var _binding: FragmentOnBoardBinding? = null
    private val binding: FragmentOnBoardBinding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentOnBoardBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = PagerAdapter()
        binding.viewPager.adapter = adapter
        //circleIndicator.setViewPager(viewPager)

        binding.btnNext.setOnClickListener {

            when (binding.viewPager.currentItem) {
                2 -> {
                    findNavController().navigate(R.id.signInFragment)
                }
                0 -> {
                    binding.viewPager.currentItem = 1
                }
                1 -> {
                    binding.viewPager.currentItem = 2
                }
            }

        }

        binding.viewPager.addOnPageChangeListener(object : OnPageChangeListener {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
            }

            override fun onPageSelected(position: Int) {
                if (position == 2) {
                    binding.btnNext.background = resources.getDrawable(R.drawable.bg_button_next)
                    binding.txtNext.text = "Начать"

                }
                else {
                    binding.btnNext.background = resources.getDrawable(R.drawable.frame)
                    binding.txtNext.text = "Дальше"
                }
            }

            override fun onPageScrollStateChanged(state: Int) {}
        })

    }
}