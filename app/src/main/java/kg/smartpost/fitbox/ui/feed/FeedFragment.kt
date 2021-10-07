package kg.smartpost.fitbox.ui.feed

import android.os.Bundle
import android.util.DisplayMetrics
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kg.smartpost.fitbox.databinding.FragmentFeedBinding
import kg.smartpost.fitbox.ui.feed.adapter.CoachAdapter
import kg.smartpost.fitbox.ui.feed.adapter.NewsPagerAdapter
import kg.smartpost.fitbox.ui.feed.adapter.PopularPagerAdapter
import kotlin.math.roundToInt


class FeedFragment : Fragment() {

    private var _binding: FragmentFeedBinding? = null
    private val binding: FragmentFeedBinding get() = _binding!!

    private lateinit var newsAdapter: NewsPagerAdapter
    private lateinit var popularAdapter: PopularPagerAdapter
    private lateinit var coachAdapter: CoachAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFeedBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupViewPager()
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        coachAdapter = CoachAdapter()
        binding.recyclerCoach.adapter = coachAdapter
    }

    private fun setupViewPager() {
        newsAdapter = NewsPagerAdapter()
        binding.recyclerView.adapter = newsAdapter

        popularAdapter = PopularPagerAdapter()
        binding.viewPagerPopular.adapter = popularAdapter
    }

    fun dpToPx(dp: Int): Int {
        val displayMetrics = requireActivity().resources.displayMetrics
        return (dp * (displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT)).roundToInt()
    }
}