package jp.techacademy.kenji.kotlinlog

import android.util.Log

open class Dog: Animal, Movable {



    constructor(name: String, age: Int): super(name,age){
//        this.name = name
//        this.age = age

    }


    override fun say(){
        Log.d(MY_TAG, this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }

    override fun move(){
        Log.d(MY_TAG, this.name + "(" + this.age + "歳)" + "は全力で走った。")
    }
}