package com.example.calcapp

import android.content.Intent
import android.icu.util.UniversalTimeScale.toLong
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.snackbar.ContentViewCallback
import android.support.design.widget.Snackbar
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        plus.setOnClickListener {
            Log.d("UI_PARTS", "プラスボタンが押されました")
//            EditTextの数字をvalueに設定
            if (editText1.text != null && editText2.text != null) {
                val intent = Intent(this, resultView::class.java)
                val value1: Double = editText1.text.toString().toDouble()
                val value2: Double = editText2.text.toString().toDouble()
                val value: Double = value1 + value2
                intent.putExtra("VALUE1", value)
                startActivity(intent)
            } else {
                Snackbar.make(plus, "Replace with your own action", Snackbar.LENGTH_INDEFINITE)
                    .setAction("Action"){
                        Log.d("UI_PARTS", "Snackbarをタップした")
                    }.show()
            }

        }



        minus.setOnClickListener {
            Log.d("UI_PARTS", "マイナスボタンが押されました")
//            EditTextの数字をtext1に設定
            if (editText1.text != null && editText2.text != null) {
                val intent = Intent(this, resultView::class.java)
                val value1: Double = editText1.text.toString().toDouble()
                val value2: Double = editText2.text.toString().toDouble()
                val value: Double = value1 - value2
                intent.putExtra("VALUE1", value)
                startActivity(intent)
            } else {
                Snackbar.make(minus, "Replace with your own action", Snackbar.LENGTH_INDEFINITE)
                    .setAction("Action"){
                        Log.d("UI_PARTS", "Snackbarをタップした")
                    }.show()
            }
        }
////
        times.setOnClickListener {
            Log.d("UI_PARTS", "かけるボタンが押されました")
//            EditTextの数字をtext1に設定
            if (editText1.text != null && editText2.text != null) {
                val intent = Intent(this, resultView::class.java)
                val value1: Double = editText1.text.toString().toDouble()
                val value2: Double = editText2.text.toString().toDouble()
                val value: Double = value1 * value2
                intent.putExtra("VALUE1", value)
                startActivity(intent)
            }
        }
////
        divided_by.setOnClickListener {
            Log.d("UI_PARTS", "わるボタンが押されました")
//            EditTextの数字をtext1に設定
            if (editText1.text != null && editText2.text != null) {
                val intent = Intent(this, resultView::class.java)
                val value1: Double = editText1.text.toString().toDouble()
                val value2: Double = editText2.text.toString().toDouble()
                val value: Double = value1 / value2
                intent.putExtra("VALUE1", value)
                startActivity(intent)
            }

        }

    }
}


