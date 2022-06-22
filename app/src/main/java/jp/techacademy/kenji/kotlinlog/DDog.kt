package jp.techacademy.kenji.kotlinlog

import android.util.Log

class DDog (var name: String, var age: Int){


    companion object {
        val to_jp = "犬"

        fun introduce(){
            Log.d(MY_TAG, "これは犬クラスです。")
        }
    }

    fun say(){
        Log.d(MY_TAG, this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }
}