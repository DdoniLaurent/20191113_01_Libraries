package com.tioeun.a20191113_01_libraries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Toast.makeText(mContext, "테스트용 토스트", Toast.LENGTH_SHORT)

        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {
        var url = "https://pbs.twimg.com/profile_images/1153500695506460672/U9lK1j6K_400x400.jpg"
        Glide.with(this).load(url).into(profileImg)
    }


}
