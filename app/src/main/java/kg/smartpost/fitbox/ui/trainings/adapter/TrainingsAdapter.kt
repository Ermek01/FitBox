package kg.smartpost.fitbox.ui.trainings.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kg.smartpost.fitbox.R
import kg.smartpost.fitbox.ui.activities.WorkoutActivity

class TrainingsAdapter(private val requireContext: Context) : RecyclerView.Adapter<TrainingsAdapter.ViewHolderTrainings>() {

    inner class ViewHolderTrainings(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(position: Int) {
            itemView.setOnClickListener {
                requireContext.startActivity(Intent(requireContext, WorkoutActivity::class.java))
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderTrainings {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_trainings, parent, false)
        return ViewHolderTrainings(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolderTrainings, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int {
        return 3
    }


}