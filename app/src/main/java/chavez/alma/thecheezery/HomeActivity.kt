package chavez.alma.thecheezery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        var intent = Intent(this, Product::class.java)


        btn_ColdDrinks.setOnClickListener {
            //intent.putExtra("drinkType", "coldDrinks")
            abrirMenu(0)
            //startActivity(intent)


        }

            btn_HotDrinks.setOnClickListener {
                //intent.putExtra("drinkType", "hotDrinks")
                abrirMenu(1)
                //startActivity(intent)

            }

            btn_Sweets.setOnClickListener {
                //intent.putExtra("drinkType", "sweetDrinks")
                abrirMenu(2)
                //startActivity(intent)

            }

            btn_Salties.setOnClickListener {
                //intent.putExtra("drinkType", "saltiesDrinks")
                abrirMenu(3)
                //startActivity(intent)

            }
        }


    private fun abrirMenu(id: Int){
        var intent = Intent(this, ProductsActivity::class.java)
        intent.putExtra("id",id)

        startActivity(intent)
    }

}

