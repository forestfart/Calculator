package com.calculator.demo;

public class Calculator {
    public int varA;
    public int varB;

    public Calculator(int varA, int varB){
        this.varA = varA;
        this.varB = varB;
    }

    public int sum(){return varA + varB;}

    public int sub(){return varA - varB;}

    //getters
    public int getA(){return varA;}

    public int getB(){return varB;}
}