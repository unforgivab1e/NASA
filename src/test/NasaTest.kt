package test

import main.NMoon
import org.testng.annotations.Test
import kotlin.test.assertEquals

class NasaTest {
    val nMoon = NMoon()

    @Test
    fun xxx(){
        val consolInput = "1 2"
        val splitConsole = nMoon.func(consolInput)
        assertEquals(splitConsole.size, 2)
    }

   // @Test
   /* fun xx1(){
        val consolInput = "1 a"
        val splitConsole = nMoon.fun2(consolInput)
        asse
    }*/
}