package kg.smartpost.fitbox.ui.trainings.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import kg.smartpost.fitbox.ui.trainings.*

class MainTabAdapter(fm: FragmentActivity) : FragmentStateAdapter(fm) {


    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> MuscleFragment()
            1 -> FatBurningFragment()
            else -> CompilationsFragment()
        }
    }


}