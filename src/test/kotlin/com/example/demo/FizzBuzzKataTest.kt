package com.example.demo

import org.example.com.example.demo.FizzBuzzKata
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FizzBuzzKataTest {
    @Test
    fun changesTheMultiplesOf3ForFizz() {
        val multiples = FizzBuzzKata()
        val result = multiples.multiplesNumber(3)
        assertEquals("Fizz", result)
    }

    @Test
    fun changesTheMultiplesOf5ForBuzz() {
        val multiples = FizzBuzzKata()
        val result = multiples.multiplesNumber(5)
        assertEquals("Buzz", result)
    }

    @Test
    fun changeTheMultiplesOf3And5ForFizzBuzz() {
        val multiples = FizzBuzzKata()
        val result = multiples.multiplesNumber(15)
        assertEquals("BuzzFizzBuzz", result)
    }

    @Test
    fun changeTheConten3And5() {
        val multiples = FizzBuzzKata()
        val result = multiples.multiplesNumber(53)
        assertEquals("FizzBuzz", result)
    }

    @Test
    fun changeTheContent3AndMultipleOf5() {
        val multiples = FizzBuzzKata()
        val result = multiples.multiplesNumber(35)
        assertEquals("FizzBuzzBuzz", result)
    }
}