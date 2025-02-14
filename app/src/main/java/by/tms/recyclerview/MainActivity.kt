package by.tms.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        BeerCollection.instance.fillGlassesWithBeer()

        recView.adapter = BeerAdapter(BeerCollection.instance.beerCollection)
        recView.layoutManager = LinearLayoutManager(this)
        recView.setHasFixedSize(true)

    }
}

