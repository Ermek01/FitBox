package kg.smartpost.fitbox.ui.activities


import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kg.smartpost.fitbox.R
import kg.smartpost.fitbox.databinding.ActivityMainBinding
import kg.smartpost.fitbox.ui.activities.adapter.MenuAdapter
import kg.smartpost.fitbox.ui.main.MainPagerAdapter
import kotlin.math.roundToInt


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var sectionPagerAdapter: MainPagerAdapter
    private lateinit var adapter: MenuAdapter

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        sectionPagerAdapter = MainPagerAdapter(supportFragmentManager)
        binding.viewPager.adapter = sectionPagerAdapter


        binding.bgBtnFeed.setOnClickListener {
            selectedBgFeed()
            binding.viewPager.currentItem = 0
        }

        binding.bgBtnTraining.setOnClickListener {
            selectedBgTraining()
            binding.viewPager.currentItem = 1
        }

        binding.bgBtnMarathon.setOnClickListener {
            selectedBgMarathon()
            binding.viewPager.currentItem = 2
        }

        binding.bgBtnNutrition.setOnClickListener {
            selectedBgNutrition()
            binding.viewPager.currentItem = 3
        }

        binding.bgProfile.setOnClickListener {
            selectedBgProfile()
            binding.viewPager.currentItem = 4
        }

//        binding.bgBtnFeed.setOnClickListener {
//
//            val layoutParams = RelativeLayout.LayoutParams(100, 69)
//            binding.bgBtnFeed.layoutParams = layoutParams
//            binding.bgBtnFeed.setBackgroundResource(R.drawable.banner_white)
//        }

//        val navView: BottomNavigationView = binding.navBottomView
//
//        val navController = findNavController(R.id.nav_host_bottom)
//        navView.setupWithNavController(navController)

        binding.btnShop.setOnClickListener {
            startActivity(Intent(this, ShopActivity::class.java))
        }

    }

    private fun selectedBgProfile() {
        binding.bgProfile.setBackgroundResource(R.drawable.bg_selected_right)
        binding.txtProfile.setTextColor(ContextCompat.getColor(this, R.color.white))
        binding.txtProfile.setTextColor(resources.getColor(R.color.white))
        binding.iconProfile.setImageResource(R.drawable.ic_profile_white)
        binding.bgProfileTop.visibility = View.VISIBLE
        defBackgroundFeed()
        defBackgroundTraining()
        defBackgroundMarathon()
        defBackgroundNutrition()
    }

    private fun selectedBgNutrition() {
        binding.bgBtnNutrition.setBackgroundResource(R.drawable.bg_selected_item)
        binding.txtNutrition.setTextColor(ContextCompat.getColor(this, R.color.white))
        binding.txtNutrition.setTextColor(resources.getColor(R.color.white))
        binding.iconNutrition.setImageResource(R.drawable.ic_nutrition_white)
        binding.bgNutritionTop.visibility = View.VISIBLE
        defBackgroundFeed()
        defBackgroundTraining()
        defBackgroundMarathon()
        defBackgroundProfile()
    }

    private fun selectedBgMarathon() {
        binding.bgBtnMarathon.setBackgroundResource(R.drawable.bg_selected_item)
        binding.txtMarathon.setTextColor(ContextCompat.getColor(this, R.color.white))
        binding.txtMarathon.setTextColor(resources.getColor(R.color.white))
        binding.iconAlarm.setImageResource(R.drawable.ic_alarm_white)
        binding.bgMarathonTop.visibility = View.VISIBLE
        defBackgroundFeed()
        defBackgroundTraining()
        defBackgroundNutrition()
        defBackgroundProfile()
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    fun selectedBgFeed() {
        binding.bgBtnFeed.setBackgroundResource(R.drawable.bg_selected_left_item)
        binding.txtFeed.setTextColor(ContextCompat.getColor(this, R.color.white))
        binding.txtFeed.setTextColor(resources.getColor(R.color.white))
        binding.iconTape.setImageResource(R.drawable.ic_tape_white)
        binding.bgFeedTop.visibility = View.VISIBLE
        defBackgroundTraining()
        defBackgroundMarathon()
        defBackgroundNutrition()
        defBackgroundProfile()
    }


    private fun selectedBgTraining() {
        binding.bgBtnTraining.setBackgroundResource(R.drawable.bg_selected_item)
        binding.txtTraining.setTextColor(ContextCompat.getColor(this, R.color.white))
        binding.txtTraining.setTextColor(resources.getColor(R.color.white))
        binding.iconDumbbel.setImageResource(R.drawable.ic_dumbbell_white)
        binding.bgTrainingTop.visibility = View.VISIBLE
        defBackgroundFeed()
        defBackgroundMarathon()
        defBackgroundNutrition()
        defBackgroundProfile()
    }

    private fun dpToPx(dp: Int): Int {
        val density: Float = applicationContext.resources
            .displayMetrics.density
        return (dp.toFloat() * density).roundToInt()
    }

    private fun defBackgroundFeed() {
        binding.bgBtnFeed.setBackgroundResource(R.color.bg_bottom_selected)
        binding.txtFeed.setTextColor(ContextCompat.getColor(this, R.color.def_text_color_menu))
        binding.txtFeed.setTextColor(resources.getColor(R.color.def_text_color_menu))
        binding.iconTape.setImageResource(R.drawable.ic_tape)
        binding.bgFeedTop.visibility = View.GONE
    }

    private fun defBackgroundTraining() {
        binding.bgBtnTraining.setBackgroundResource(R.color.bg_bottom_selected)
        binding.txtTraining.setTextColor(ContextCompat.getColor(this, R.color.def_text_color_menu))
        binding.txtTraining.setTextColor(resources.getColor(R.color.def_text_color_menu))
        binding.iconDumbbel.setImageResource(R.drawable.ic_dumbbell)
        binding.bgTrainingTop.visibility = View.GONE
    }

    private fun defBackgroundMarathon() {
        binding.bgBtnMarathon.setBackgroundResource(R.color.bg_bottom_selected)
        binding.txtMarathon.setTextColor(ContextCompat.getColor(this, R.color.def_text_color_menu))
        binding.txtMarathon.setTextColor(resources.getColor(R.color.def_text_color_menu))
        binding.iconAlarm.setImageResource(R.drawable.ic_alarm)
        binding.bgMarathonTop.visibility = View.GONE
    }

    private fun defBackgroundNutrition() {
        binding.bgBtnNutrition.setBackgroundResource(R.color.bg_bottom_selected)
        binding.txtNutrition.setTextColor(ContextCompat.getColor(this, R.color.def_text_color_menu))
        binding.txtNutrition.setTextColor(resources.getColor(R.color.def_text_color_menu))
        binding.iconNutrition.setImageResource(R.drawable.ic_nutrition)
        binding.bgNutritionTop.visibility = View.GONE
    }

    private fun defBackgroundProfile() {
        binding.bgProfile.setBackgroundResource(R.color.bg_bottom_selected)
        binding.txtProfile.setTextColor(ContextCompat.getColor(this, R.color.def_text_color_menu))
        binding.txtProfile.setTextColor(resources.getColor(R.color.def_text_color_menu))
        binding.iconProfile.setImageResource(R.drawable.ic_profile)
        binding.bgProfileTop.visibility = View.GONE
    }

    override fun onBackPressed() {

        if (binding.viewPager.currentItem == 0) {
            super.onBackPressed()
        }
        else {
            binding.viewPager.currentItem = 0
            selectedBgFeed()
        }


    }


}