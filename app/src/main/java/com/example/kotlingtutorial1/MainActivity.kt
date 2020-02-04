package com.example.kotlingtutorial1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener{
            Log.i("Main Activity","Button was clicked")
            Toast.makeText(this,"Button was clicked",Toast.LENGTH_SHORT).show()
        }

        btnSendMsgtoNextActivity.setOnClickListener{

            val message:String = etUserMessage.text.toString()


            //we are using explicent intent
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("user_msg",message)
            startActivity(intent)
        }
        btnShare.setOnClickListener{
            val message:String = etUserMessage.text.toString()
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT,message)
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent,"Share to"))


        }
        btnRecycleViewDemo.setOnClickListener{
            val intent = Intent(this,Hobbies::class.java)

            startActivity(intent)
        }
    }
}
