package kg.smartpost.fitbox.ui.nutrition.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kg.smartpost.fitbox.databinding.ItemNutritionBinding

class NutritionAdapter(private var titles: ArrayList<String>, private val desc: ArrayList<String>, private val listener: NutritionClickListener) : RecyclerView.Adapter<NutritionAdapter.ViewHolderNutrition>() {

    private var _binding: ItemNutritionBinding? = null

    inner class ViewHolderNutrition(private val binding: ItemNutritionBinding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(position: Int) {
            binding.txtName.text = titles[position]
            binding.txtDesc.text = desc[position]

            binding.root.setOnClickListener {
                listener.onCategoryClick(position)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderNutrition {
        _binding =
            ItemNutritionBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolderNutrition(_binding!!)
    }

    override fun onBindViewHolder(holder: ViewHolderNutrition, position: Int) {
        holder.onBind(position)
    }

    override fun getItemCount(): Int {
        return 3
    }

    interface NutritionClickListener {
        fun onCategoryClick(position: Int)
    }


}