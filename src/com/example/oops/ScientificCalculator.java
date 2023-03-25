package com.example.oops;

//Sub Class
public class ScientificCalculator extends Calculator{
    //Constructor
    public ScientificCalculator(){
        System.out.println("CONSTRUCTOR CALLED");
    }

    //Constructor Overloading
    ScientificCalculator(double firstNumber, double secondNumber){
        super(firstNumber, secondNumber);
    }

    public double sinValue(double angle){
        return Math.sin(angle);
    }

    protected double cosValue(double angle){
        return Math.cos(angle);
    }

    public double tanValue(double angle){
        return Math.tan(angle);
    }

    public double exponentialValue(double x, double y){
        return Math.pow(x,y);
    }

    //Method Overriding
    //1. It occurs in super class and sub class
    //2. Method signatures are same
    public double divide(){
        if(secondNumber == 0){
            System.out.println("SECOND OPERAND IS ZERO, DIVISION IS NOT POSSIBLE");
            return 0;
        }
        return firstNumber/secondNumber;
    }
}
