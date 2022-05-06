package com.innovorder.testtechnique

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.innovorder.testtechnique.databinding.ItemBinding
import java.util.*


class DucksAdapter : ListAdapter<Duck, DucksAdapter.ViewHolder>(DiffUtilCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(ItemBinding.inflate(layoutInflater, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    object DiffUtilCallback : DiffUtil.ItemCallback<Duck>() {
        override fun areItemsTheSame(oldItem: Duck, newItem: Duck): Boolean =
            oldItem.name == newItem.name

        override fun areContentsTheSame(oldItem: Duck, newItem: Duck): Boolean =
            oldItem == newItem

    }

    class ViewHolder(private val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(duck: Duck) {
            Glide.with(itemView.context).load("${BuildConfig.BASE_URL_IMAGE}${duck.image}")
                .apply(RequestOptions().transform(CenterCrop(), RoundedCorners(32)))
                .into(binding.image)
        }
    }
}
