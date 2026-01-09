package com.example.genialidad

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.genialidad.databinding.ItemViewMainBinding
import org.w3c.dom.Text

class MainRVAdapter(private val listData:List<String>, private val onClick:(String)-> Unit) : RecyclerView.Adapter<MainRVAdapter.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val binding =
            ItemViewMainBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        holder.bind(listData[position], onClick)

    }

    override fun getItemCount(): Int = listData.size

    class ViewHolder(private val binding: ItemViewMainBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(dataText: String, onClick: (String) -> Unit){
            binding.mainItemViewText.text=dataText
            binding.mainItemViewText.setOnClickListener { onClick(dataText) }

        }

    }
}