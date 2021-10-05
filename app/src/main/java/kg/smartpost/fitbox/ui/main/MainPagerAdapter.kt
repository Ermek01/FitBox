package kg.smartpost.fitbox.ui.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import kg.smartpost.fitbox.ui.feed.FeedFragment
import kg.smartpost.fitbox.ui.marathons.MarathonsFragment
import kg.smartpost.fitbox.ui.nutrition.NutritionFragment
import kg.smartpost.fitbox.ui.profile.ProfileFragment
import kg.smartpost.fitbox.ui.trainings.TrainingsFragment

class MainPagerAdapter(
    fm: FragmentActivity
) : FragmentStateAdapter(fm) {

    override fun getItemCount(): Int {
        return 5
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FeedFragment()
            1 -> TrainingsFragment()
            2 -> MarathonsFragment()
            3 -> NutritionFragment()
            else -> ProfileFragment()
        }
    }
}