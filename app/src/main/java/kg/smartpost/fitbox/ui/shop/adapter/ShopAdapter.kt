package kg.smartpost.fitbox.ui.shop.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import kg.smartpost.fitbox.R
import kg.smartpost.fitbox.databinding.ItemNutritionBinding
import kg.smartpost.fitbox.databinding.ItemShopsBinding
import kg.smartpost.fitbox.ui.feed.adapter.ImagePagerAdapter
import kg.smartpost.fitbox.ui.splash.adapter.PagerAdapter

class ShopAdapter : RecyclerView.Adapter<ShopAdapter.ViewHolderShop>() {

    class ViewHolderShop(view: View) : RecyclerView.ViewHolder(view) {

        val viewPager: ViewPager = view.findViewById(R.id.view_pager_shop)
        val tabLayout: TabLayout = view.findViewById(R.id.tab_layout_shop)

        fun bind(position: Int) {
            val adapter = ImagePagerAdapter()
            viewPager.adapter = adapter
            tabLayout.setupWithViewPager(viewPager, true)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderShop {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_shops, parent, false)
        return ViewHolderShop(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolderShop, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int {
        return 3
    }


}