package com.calculator.calculator;

/**
 * Hello world!
 *
 */
public class App 
{
	int a,b;
	
	public App(int x, int y) {
		a=x;
		b=y;
	}
	
	public int add() {
		return a+b;
	}
	
	public int sub() {
		return a-b;
	}
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
