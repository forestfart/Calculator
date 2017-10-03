package com.calculator.demo;

public class DemoApplication {

	public static void main(String[] args) {

		Calculator calculator = new Calculator(1,5);
		System.out.println(calculator.getA() + " + " + calculator.getB() + " = " + calculator.sum());
		System.out.println(calculator.getA() + " - " + calculator.getB() + " = " + calculator.sub());
	}
}
