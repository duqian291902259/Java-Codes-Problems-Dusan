package site.duqian.algorithm

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var mTextMessage: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mTextMessage = findViewById(R.id.message)
        mTextMessage.text = "小菜算法项目计划，准备将常见算法题目用java，kotlin，" +
                "c++，js实现，可以查看原题，解题思路，各种语言实现，欢迎关注"
    }
}