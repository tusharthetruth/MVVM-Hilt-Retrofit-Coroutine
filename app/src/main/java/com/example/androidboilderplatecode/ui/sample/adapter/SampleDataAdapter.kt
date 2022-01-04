package com.example.androidboilderplatecode.ui.sample.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.androidboilderplatecode.R
import com.example.androidboilderplatecode.data.sample.SampleDataModel
import com.example.androidboilderplatecode.databinding.SampleListBinding

class SampleDataAdapter :
    ListAdapter<SampleDataModel, SampleDataAdapter.SampleDataHolder>(SimpleDiffCallBack) {

    var list=ArrayList<SampleDataModel>()

    override fun getItemCount(): Int {
        return list.size
    }

    class SampleDataHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private var binding=SampleListBinding.bind(itemView)
        fun bindItem(model: SampleDataModel){
            binding.description=model.description
            binding.link=model.link
            binding.name=model.apiName

        }

    }

    object SimpleDiffCallBack : DiffUtil.ItemCallback<SampleDataModel>() {
        override fun areItemsTheSame(oldItem: SampleDataModel, newItem: SampleDataModel): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(
            oldItem: SampleDataModel,
            newItem: SampleDataModel
        ): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SampleDataHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.sample_list,null)
        return SampleDataHolder(view)

    }

    override fun onBindViewHolder(holder: SampleDataHolder, position: Int) {
        holder.bindItem(list[position])
    }

    fun updateItems(newList:ArrayList<SampleDataModel>){
        list.clear()
        list.addAll(newList)
        notifyDataSetChanged()
    }
}