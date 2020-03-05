package com.zhoukaibo.spi;

public class PlusOperationImpl implements IOperation {

	public PlusOperationImpl() {
		System.out.println("plusOperation construct");
	}

	public int operation(int numberA, int numberB) {
    	System.out.println("Operation: plus");

        return numberA + numberB;
    }
}