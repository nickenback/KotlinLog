package jp.techacademy.kenji.kotlinlog
import android.util.Log

class BigDog: Dog {
    constructor(name: String, age: Int): super(name,age){

    }

    override fun say(){
        super.say()
        Log.d(MY_TAG, "大好きな犬です。")
    }
}