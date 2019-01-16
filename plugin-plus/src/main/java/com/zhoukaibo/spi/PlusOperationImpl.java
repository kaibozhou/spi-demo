package com.zhoukaibo.spi;

public class PlusOperationImpl implements IOperation {
    public int operation(int numberA, int numberB) {
    	System.out.println("Operation: plus");

        return numberA + numberB;
    }
}