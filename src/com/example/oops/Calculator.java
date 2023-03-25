package com.example.oops;

//Base Class or Super class
public class Calculator {
    //Properties / Instance Variables / Class variables
    double firstNumber;
    double secondNumber;
    //OVERLOADING
    //1. Occurs in the same class
    //2. Method signatures are different
    //Methods / Behaviours

    Calculator(){
        System.out.println("CALCULATOR CONSTRUCTOR CALLED");
    }

    Calculator(double firstNumber, double secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public double add(){
        return firstNumber + secondNumber;
    }

    public double add(double thirdNumber){
        return firstNumber + secondNumber + thirdNumber;
    }

    public double subtract(){
        return firstNumber - secondNumber;
    }

    public double multiply(){
        return firstNumber * secondNumber;
    }

    public double divide(){
        return firstNumber / secondNumber;
    }
}
