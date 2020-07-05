package kr.co.tjoeun.kotlinbasic_20200704

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        적용하기 버틴이 눌린 경우
        applyBtn.setOnClickListener {
//            inputEdt에 입력된 내용(text속성의 값)을 받아와서 (get)
            val inputContent = inputEdt.text.toString()

//            resultTxt의 내용(text속성의 값)으로 반영 (set)
            resultTxt.text = inputContent
        }

        touchBtn.setOnClickListener {
//            터치 버튼이 눌리면 실행될 코드를 적는 공간

//            Toast는 JAVA시절부터 쓰던 클래스. static method
            Toast.makeText(this, "버튼 눌림", Toast.LENGTH_SHORT).show()

            Log.d("메인화면", "버튼 눌림")

            Log.e("메인화면", "에러시 로그 찍을 때 사용")

//            Kotlin 문법 / 개념 확인
            val num1 = 10
            num1.toString()  // Int도 참조형 변수임을 확인

//            when 활용 연습
            when (num1) {
                10 -> {
                    Log.d("조건문연습", "num1에 10이 있다")
                    Log.d("조건문연습", "num1에 10이 있을 때 둘째줄")
                }
                15 -> {Log.d("조건문연습","num1에 15이 있다")}
                17, 18, 19 -> {Log.d("조건문연습","num1이 17, 18, 19 중 하나다")}
                in 20..29 -> {Log.d("조건문연습","num1에 20~29다")}
                else -> {Log.d("조건문연습" , "그외의 숫자")}
            }


        }
    }
}