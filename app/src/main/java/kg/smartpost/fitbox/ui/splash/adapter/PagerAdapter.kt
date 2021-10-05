package kg.smartpost.fitbox.ui.splash.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter
import kg.smartpost.fitbox.R

class PagerAdapter: PagerAdapter() {

    private val titles = arrayOf("Всё что тебе необходимо для эффективных домашних тренировок", "Более 300 упражнений и бесплатные программы тренировок под разные цели и задачи", "Начни тренироваться дома вместе с fitbox")
    private val descriptions = arrayOf("Мы объединили все самые важные и нужные тренировочные снаряды, которые позволят тебе тренироваться максимально разнообразно и эффективно  ", "С fitbox ты можешь похудеть, проработать отстающие мышечные группы, развить силу и выносливость, улучшить физическую форму, все тренировки и программы имеют 3 уровня сложности и подойдут как новичкам, так и опытным атлетам", "Управляй своим временем, тренируйся когда тебе удобно не выходя из дома, экономь свое время и деньги, ставь цель, выбирай тренировочную программу и начинай работать на результат!")
    private val drawables =
        intArrayOf(R.drawable.onboard_page1, R.drawable.onboard_page2, R.drawable.onboard_page3)

    override fun getCount(): Int {
        return 3
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view =
            LayoutInflater.from(container.context).inflate(R.layout.page_onboard, container, false)
        val textTitle = view.findViewById<TextView>(R.id.title)
        val textDesc = view.findViewById<TextView>(R.id.desc)
        val imageView = view.findViewById<ImageView>(R.id.img)

        textTitle.text = titles[position]
        textDesc.text = descriptions[position]
        imageView.setImageResource(drawables[position])
        container.addView(view)
        return view
    }


}