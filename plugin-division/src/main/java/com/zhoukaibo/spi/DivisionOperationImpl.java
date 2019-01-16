package com.zhoukaibo.spi;

public class DivisionOperationImpl implements IOperation {

    @Override
    public int operation(int numberA, int numberB) {
	    System.out.println("Operation: division");
        return numberA / numberB;
    }
}