package jp.techacademy.kenji.kotlinlog

import android.util.Log

open class Human: Animal.Animal2, Thinkable {


    constructor(name: String, age: Int, hobby: String) : super(name, age, hobby) {
    }

    override fun say() {
        Log.d(MY_TAG, "私の名前は" + this.name + "です。年は" + this.age + "歳です。")
    }
    override fun think(){
        Log.d(MY_TAG, "私は" + this.hobby + "について考える")
    }
}