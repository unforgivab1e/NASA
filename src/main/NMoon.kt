package main

import exception.FormException
import java.util.*

class NMoon {

    fun func(input : String)  : List<String>?{
        //1, input
        //2, inout -> input1
        //3, input1-> input2
        //.
        //.
        // out
        var map = input.split(" ")
        if (checkForm(map)) return map
        return null
//        var map:List<Int>
//        var location:List<Int>
//        var direction='N'
    }

    private fun checkForm(map: List<String>): Boolean {
        if (stringToInt(map[0])< 0 ||stringToInt(map[0]) < 0) {
            println("form wrong")
        } else {
            return true
        }
        return false
    }

    fun stringToInt(alfa : String) : Int{
        try{
           return alfa.toInt()

        }catch (e: java.lang.Exception){
            throw FormException("from wrong")
        }

    }

}