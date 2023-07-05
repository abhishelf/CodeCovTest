package com.abhishek.codecovtest

import org.junit.Test

import org.junit.Assert.*

class CalculatorHelperUnitTest {

    @Test
    fun testAdditionMethod() {
        assertEquals(8, CalculatorHelper.addUnitTest(3, 4))
    }

    @Test
    fun testSubtractionMethod() {
        assertEquals(1, CalculatorHelper.subtractUnitTest(4, 3))
    }

    @Test
    fun testMultiplicationMethod() {
        assertEquals(12, CalculatorHelper.multiplyUnitTest(4, 3))
    }
}
