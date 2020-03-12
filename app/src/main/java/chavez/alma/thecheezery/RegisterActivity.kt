package chavez.alma.thecheezery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val button2: Button = findViewById(R.id.buttono) as Button

        button2.setOnClickListener {
            var intent: Intent = Intent(this, ProductsActivity::class.java)
            startActivity(intent)
        }
    }
}
