package kg.smartpost.fitbox.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kg.smartpost.fitbox.R
import kg.smartpost.fitbox.databinding.ActivityExampleDietsBinding
import kg.smartpost.fitbox.databinding.ActivityFreeProgramsBinding
import kg.smartpost.fitbox.ui.nutrition.adapter.DietsPagerAdapter

class ExampleDietsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityExampleDietsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExampleDietsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val tabs = listOf(
            "1000 Ккал",
            "1500 Ккал",
            "1500 Ккал",
            "1500 Ккал",
            "1500 Ккал"
        )

        binding.tabsMain.tabMode = TabLayout.MODE_SCROLLABLE

        val adapter = DietsPagerAdapter(this)

        binding.viewPager.adapter = adapter
        TabLayoutMediator(binding.tabsMain, binding.viewPager) { tab, position ->
            tab.text = tabs[position]
        }.attach()

    }
}