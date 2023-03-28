package com.abhishek.codecovtest

import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

@RunWith(AndroidJUnit4::class)
class CalculatorHelperInstrumentedTest {

    @Test
    fun testAdditionMethod() {
        assertEquals(7, CalculatorHelper.addAndroidTest(3, 4))
    }

    @Test
    fun testSubtractionMethod() {
        assertEquals(1, CalculatorHelper.subtractAndroidTest(4, 3))
    }

    @Test
    fun testMultiplicationMethod() {
        assertEquals(12, CalculatorHelper.multiplyAndroidTest(4, 3))
    }
}
