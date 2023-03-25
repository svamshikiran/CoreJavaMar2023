package com.example.oops;

public class TestClass {

    public static void main(String[] args) {

        ScientificCalculator sCalcObj = new ScientificCalculator(10 , 30);
        ScientificCalculator sCalcObjTwo = new ScientificCalculator(56, 4);

        double addResult = sCalcObjTwo.add();
        System.out.println("ADD RESULT FOR OBJECT 2: "+addResult);

        double result = sCalcObj.add();
        double resultAdd = sCalcObj.add(45);
        double resultOne = sCalcObj.cosValue(30);
        double divisionResult = sCalcObj.divide();
        System.out.println("RESULT: "+result);
        System.out.println("SIN VALUE: "+resultOne);
        System.out.println("ADD VALUE: "+resultAdd);
        System.out.println("DIVISION VALUE: "+divisionResult);
    }
}
