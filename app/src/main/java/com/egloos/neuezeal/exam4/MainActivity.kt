package com.egloos.neuezeal.exam4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        photoView.setOnClickListener(object: View.OnClickListener{
            var isDefault = true
            override fun onClick(v: View?) {
                isDefault = !isDefault
                if (isDefault == true) photoView.setImageResource(R.drawable.hodu5)
                else photoView.setImageResource(R.drawable.hodu1)
            }
        })

        scaleTypeButton.setOnClickListener(object: View.OnClickListener{
            var isDefault = true
            override fun onClick(v: View?) {
                isDefault = !isDefault
                if(isDefault == true) photoView.scaleType = ImageView.ScaleType.CENTER_CROP
                else photoView.scaleType = ImageView.ScaleType.CENTER_INSIDE
            }

        })
    }
}
