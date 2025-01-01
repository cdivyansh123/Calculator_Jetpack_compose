package com.example.calculator

sealed class CalculatorActions{
    data class Number(val number: Int):CalculatorActions()
    object Clear:CalculatorActions()
    object delete:CalculatorActions()
    object decimal:CalculatorActions()
    object calculate:CalculatorActions()
    data class operation(val operation: CalculatorOperation):CalculatorActions()

}