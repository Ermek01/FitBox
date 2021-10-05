package kg.smartpost.fitbox.ui.nutrition.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import kg.smartpost.fitbox.ui.nutrition.DietsFragment

class DietsPagerAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 5
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> DietsFragment()
            1 -> DietsFragment()
            2 -> DietsFragment()
            3 -> DietsFragment()
            else -> DietsFragment()
        }
    }
}