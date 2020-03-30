package by.tms.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.recycler_item.view.*


class BeerAdapter(val list: ArrayList<Beer>): RecyclerView.Adapter<BeerAdapter.BeerViewHolder>() {


    class BeerViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BeerViewHolder {
        val itemView= LayoutInflater.from(parent.context).inflate(R.layout.recycler_item, parent, false)
        return BeerViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: BeerViewHolder, position: Int) {
        val myView = holder.itemView

        myView.nameBeer.text = list.get(position).name
        myView.priceBeer.text = list.get(position).price.toString()
        Picasso.get().load(list.get(position).imageUrl).into(myView.imageBeer)

        myView.setOnClickListener {
            Toast.makeText(holder.itemView.context, list.get(position).name, Toast.LENGTH_SHORT).show()
        }
    }

}