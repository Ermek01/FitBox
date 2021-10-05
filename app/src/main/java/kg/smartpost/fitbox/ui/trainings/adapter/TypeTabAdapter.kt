package kg.smartpost.fitbox.ui.trainings.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import kg.smartpost.fitbox.ui.trainings.FitboxFragment
import kg.smartpost.fitbox.ui.trainings.InventoryFragment

class TypeTabAdapter(fm: FragmentActivity) : FragmentStateAdapter(fm) {


    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> FitboxFragment()
            else -> InventoryFragment()
        }
    }


}