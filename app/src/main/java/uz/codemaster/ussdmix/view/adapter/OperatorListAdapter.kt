package uz.codemaster.ussdmix.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.operator_item_layout.view.*
import uz.codemaster.ussdmix.R


interface OperatorListener{
    fun onClickItem(index: Int)
}
class OperatorListAdapter(val items: MutableList<Int>, val listener: OperatorListener): RecyclerView.Adapter<OperatorListAdapter.ItemHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.operator_item_layout, parent, false)

        return ItemHolder(view)
    }




    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        holder.itemView.imageView.setImageResource(items.get(position))
        //imageView.setColorFilter(ContextCompat.getColor(context, R.color.COLOR_YOUR_COLOR), android.graphics.PorterDuff.Mode.MULTIPLY);
        holder.itemView.setOnClickListener {
            listener.onClickItem(position)
        }
    }
    inner class ItemHolder(itemView: View):RecyclerView.ViewHolder(itemView)
}


