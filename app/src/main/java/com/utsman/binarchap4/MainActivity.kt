package com.utsman.binarchap4

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    private val TAG = "ini tag"
    private lateinit var contohString: String

    //private val tvHelloWord: TextView by lazy { findViewById(R.id.tv_hello_word) }
    //private var tvHelloWord: TextView? = null
    private lateinit var tvHelloWord: TextView
    private val imageView: ImageView by lazy { findViewById(R.id.image_view) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        tvHelloWord = findViewById(R.id.tv_hello_word)

        contohString = "ini contoh string"
        tvHelloWord.text = contohString


        // textView.setTypeface(null, Typeface.ITALIC);
        tvHelloWord.setOnClickListener {
            tvHelloWord.setTypeface(null, Typeface.ITALIC)
        }

        imageView.setOnClickListener {
            tvHelloWord.text = "ini ke ganti dari image view"
        }


        Log.w(TAG, "onCreate: ini fungsi oncreate")

        val namaDefaultConst = Animals.NAME_DEFAULT

        val human = Animals.getNameOfAnimals()

        Log.d(TAG, "onCreate: user milih kertas")
    }
}