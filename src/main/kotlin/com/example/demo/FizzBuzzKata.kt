package org.example.com.example.demo

class FizzBuzzKata {
    fun multiplesNumber(number : Int): String {
        var result : String = this.containsNumber(number.toString())

        if(number % 3 == 0 && number % 5 == 0){
            result += "FizzBuzz"
        }else if(number % 3 == 0 || number % 5 == 0){
            result += if (number%3 == 0 ) "Fizz" else "Buzz"
        }else if(result.length == 0){
            result = number.toString()
        }

        return result
    }

    fun containsNumber(number : String) : String {

        var result = ""

        if(number.contains("3") && number.contains("5")){
            result = "FizzBuzz"
        }else if (number.contains("3") && number.length > 1){
            result = "Fizz"
        }else if (number.contains("5") && number.length > 1){
            result = "Buzz"
        }
        return result
    }
}
