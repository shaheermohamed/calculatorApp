package com.example.calculatorapp

sealed class CalculateOperation(val symbol:String) {
    object Add:CalculateOperation(symbol = "+")
    object Subtract:CalculateOperation(symbol = "-")
    object Multiply:CalculateOperation(symbol = "x")
    object Divide:CalculateOperation(symbol = "/")
}