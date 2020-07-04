package kr.co.tjoeun.kotlinbasic_20200704

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        touchBtn.setOnClickListener {
            //터치 버튼이 눌리면 실행될 코드를 적는 공간

            //Toast는 JAVA시절부터 쓰던 클래스. static method
            Toast.makeText(this, "버튼 눌림", Toast.LENGTH_SHORT).show()

        }
    }
}