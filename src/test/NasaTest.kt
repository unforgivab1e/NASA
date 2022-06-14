package test


import exception.FormException
import main.NMoon
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertFails
import kotlin.test.assertFailsWith


class NasaTest {
    val nMoon = NMoon()

    @Test
    fun theFirstRowGetsTwoPiecesOfData(){
        val consolInput = "1 2"
        val splitConsole = nMoon.func(consolInput)
        if (splitConsole != null) {
            assertEquals(splitConsole.size, 2)
        }
    }

   @Test
    fun testsWhetherTwoPiecesOfDataAreNumbers(){
        val consolInput = "1 a"
        assertFailsWith<FormException> { nMoon.stringToInt(consolInput) }


    }
}