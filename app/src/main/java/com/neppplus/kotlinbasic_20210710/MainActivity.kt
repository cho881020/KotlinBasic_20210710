package com.neppplus.kotlinbasic_20210710

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        테스트 버튼이 눌리면 할 일을 지정해주자.
        testBtn.setOnClickListener {

//            버튼이 눌리는지 로그를 찍어보자.
            Log.d("메인화면", "테스트 버튼 클릭됨")
            Log.i("메인화면", "로그 두줄이 찍히게.")



        }

        secondBtn.setOnClickListener {
            Log.e("메인화면", "두번째 버튼 클릭")
        }

        toastBtn.setOnClickListener {
            Toast.makeText(this, "연습용 토스트", Toast.LENGTH_SHORT).show()
        }

    }
}