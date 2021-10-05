package kg.smartpost.fitbox.ui.marathons.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kg.smartpost.fitbox.R
import kg.smartpost.fitbox.ui.activities.FreeProgramsActivity

class OtherAdapter(private val requireContext: Context) : RecyclerView.Adapter<OtherAdapter.ViewHolderOther>() {

    inner class ViewHolderOther(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(position: Int) {
            itemView.setOnClickListener {
                requireContext.startActivity(Intent(requireContext, FreeProgramsActivity::class.java))
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderOther {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_other_programs, parent, false)
        return ViewHolderOther(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolderOther, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int {
        return 3
    }


}