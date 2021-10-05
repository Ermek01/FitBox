package kg.smartpost.fitbox.ui.nutrition.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import kg.smartpost.fitbox.R

class DietsAdapter : RecyclerView.Adapter<DietsAdapter.ViewHolderDiets>() {

    class ViewHolderDiets(view: View) : RecyclerView.ViewHolder(view) {

        val btnNutrition = view.findViewById<ConstraintLayout>(R.id.btn_nutrition)
        val dietsView = view.findViewById<LinearLayout>(R.id.diets_view)
        val imageView = view.findViewById<ImageView>(R.id.imageView11)

        fun bind(position: Int) {

            btnNutrition.setOnClickListener {
                if (dietsView.visibility == View.GONE) {
                    dietsView.visibility = View.VISIBLE
                    imageView.setImageResource(R.drawable.vector_btn_nutrition)
                    btnNutrition.setBackgroundResource(R.drawable.edit)
                } else {
                    dietsView.visibility = View.GONE
                    imageView.setImageResource(R.drawable.vector_right)
                    btnNutrition.setBackgroundResource(R.drawable.bg_btn_nutrition)
                }
            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderDiets {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_diets, parent, false)
        return ViewHolderDiets(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolderDiets, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int {
        return 3
    }


}