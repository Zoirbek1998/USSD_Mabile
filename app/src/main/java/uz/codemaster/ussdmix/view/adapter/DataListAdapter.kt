package uz.codemaster.ussdmix.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.internet_layout_item.view.*
import kotlinx.android.synthetic.main.internet_layout_item.view.tvAmount
import kotlinx.android.synthetic.main.internet_layout_item.view.tvPrice
import kotlinx.android.synthetic.main.internet_layout_item.view.tvTitle
import kotlinx.android.synthetic.main.service_layout_item.view.*
import kotlinx.android.synthetic.main.tarif_layout_item.view.*
import uz.codemaster.ussdmix.R
import uz.codemaster.ussdmix.model.*
import uz.codemaster.ussdmix.utils.Constants
import uz.codemaster.ussdmix.utils.Constants.Companion.CATEGORY_ADVEN
import uz.codemaster.ussdmix.utils.Constants.Companion.CATEGORY_INTERNET
import uz.codemaster.ussdmix.utils.Constants.Companion.CATEGORY_MINUTES
import uz.codemaster.ussdmix.utils.Constants.Companion.CATEGORY_SERVICES
import uz.codemaster.ussdmix.utils.Constants.Companion.CATEGORY_SMS
import uz.codemaster.ussdmix.utils.Constants.Companion.CATEGORY_TARIF

interface DataListener{
    fun onClickItem(data: Any)
}
class DataListAdapter(val items: MutableList<Any>, val type: Int, val typeOperator: Int, val listener: DataListener): RecyclerView.Adapter<DataListAdapter.ItemHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        if (type == CATEGORY_INTERNET) {
            return ItemHolder(bindInternetData(parent))
        }else if (type == CATEGORY_TARIF) {
            return ItemHolder(bindTarifData(parent))
        }else if (type == CATEGORY_MINUTES) {
            return ItemHolder(bindTarifData(parent))
        }else if (type == CATEGORY_SMS) {
            return ItemHolder(bindInternetData(parent))
        }else if (type == CATEGORY_ADVEN) {
            return ItemHolder(bindAdvenData(parent))
        }else if (type == CATEGORY_SERVICES) {
            return ItemHolder(bindAdvenData(parent))
        }

        return ItemHolder(bindInternetData(parent))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        val data = items.get(position)

        holder.itemView.setOnClickListener {
            listener.onClickItem(data)
        }
        if (data is InternetModel){
            setInternetData(holder, data)
        }else if (data is TarifModel){
            setTarifData(holder, data)
        }else if (data is MinuteModel){
            setMinuteData(holder, data)
        }else if (data is BaseModel){
            setSMSData(holder, data)
        }else if (data is AdventageModel){
            setAdvenData(holder, data)
        }else if (data is ServiceModel){
            setServiceData(holder, data)
        }

    }

    fun bindInternetData(parent: ViewGroup): View{
        return LayoutInflater.from(parent.context).inflate(R.layout.internet_layout_item, parent, false)
    }

    fun bindTarifData(parent: ViewGroup): View{
        return LayoutInflater.from(parent.context).inflate(R.layout.tarif_layout_item, parent, false)

    }

    fun bindAdvenData(parent: ViewGroup): View{
        return LayoutInflater.from(parent.context).inflate(R.layout.service_layout_item, parent, false)
    }


    fun setInternetData(holder: ItemHolder, item: InternetModel){
        holder.itemView.tvTitle.text = item.title
        holder.itemView.tvAmount.text = item.volume
        holder.itemView.tvPrice.text = item.price
        holder.itemView.frame.setBackgroundColor(ContextCompat.getColor(holder.itemView.context, Constants.getOperatorColors(typeOperator)))
    }

    fun setTarifData(holder: ItemHolder, item: TarifModel){
        holder.itemView.tvTitle.text = item.title
        holder.itemView.tvAmount.text = item.volume
        holder.itemView.tvPrice.text = item.price
        holder.itemView.tvComment.text = item.comment
        holder.itemView.frameTarif.setBackgroundColor(ContextCompat.getColor(holder.itemView.context, Constants.getOperatorColors(typeOperator)))
    }

    fun setMinuteData(holder: ItemHolder, item: MinuteModel){
        holder.itemView.tvTitle.text = item.title
        holder.itemView.tvAmount.text = item.volume
        holder.itemView.tvPrice.text = item.price
        holder.itemView.tvComment.text = item.comment
        holder.itemView.frameTarif.setBackgroundColor(ContextCompat.getColor(holder.itemView.context, Constants.getOperatorColors(typeOperator)))
    }

    fun setSMSData(holder: ItemHolder, item: BaseModel){
        holder.itemView.tvTitle.text = item.title
        holder.itemView.tvAmount.text = item.volume
        holder.itemView.tvPrice.text = item.price
        holder.itemView.frame.setBackgroundColor(ContextCompat.getColor(holder.itemView.context, Constants.getOperatorColors(typeOperator)))
    }

    fun setAdvenData(holder: ItemHolder, item: AdventageModel){
        holder.itemView.tvTitle.text = item.title
        holder.itemView.frameService.setBackgroundColor(ContextCompat.getColor(holder.itemView.context, Constants.getOperatorColors(typeOperator)))
    }

    fun setServiceData(holder: ItemHolder, item: ServiceModel){
        holder.itemView.tvTitle.text = item.title
        holder.itemView.frameService.setBackgroundColor(ContextCompat.getColor(holder.itemView.context, Constants.getOperatorColors(typeOperator)))
    }


    inner class ItemHolder(itemView: View):RecyclerView.ViewHolder(itemView)
}